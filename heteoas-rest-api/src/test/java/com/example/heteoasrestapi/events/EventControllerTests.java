package com.example.heteoasrestapi.events;

import com.example.heteoasrestapi.common.TestDescription;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class) // junit4
@SpringBootTest
@AutoConfigureMockMvc
public class EventControllerTests {

    // mocking이 되어있는 dispacher servlet 을 이용해
    // request 를 테스트할 수 있는 bean
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @TestDescription("정상적으로 이벤트를 생성하는 테스트")
    public void createEvent() throws Exception {
        // 요청 파라미터
        EventDto eventDto = EventDto.builder()
                .name("spring")
                .description("REST API Development with Spring")
                .beginEnrollmentDateTime(LocalDateTime.of(2018, 11, 23, 0, 0))
                .closeEnrollmentDateTime(LocalDateTime.of(2018, 11, 24, 0, 0))
                .beginEventDateTime(LocalDateTime.of(2018, 11, 25, 0, 0))
                .endEventDateTime(LocalDateTime.of(2018, 11, 26, 0, 0))
                .basePrice(100)
                .maxPrice(200)
                .limitOfEnrollment(100)
                .location("강남역 D2 스타텁 팩토리")
                .build();

        mockMvc.perform(post("/api/events/")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaTypes.HAL_JSON)
                .content(objectMapper.writeValueAsString(eventDto)))
                .andDo(print())
                .andExpect(status().isCreated()) // stateus().is(201)
                .andExpect(jsonPath("id").exists())
//                .andExpect(header().exists("Location"))
                .andExpect(header().exists(HttpHeaders.LOCATION))
//                .andExpect(header().string("Content-Type", "application/hal+json;charset=UTF-8"));
                .andExpect(header().string(HttpHeaders.CONTENT_TYPE, MediaTypes.HAL_JSON_VALUE))
                .andExpect(jsonPath("id").exists())
                .andExpect(jsonPath("free").value(false))
                .andExpect(jsonPath("offline").value(true))
                .andExpect(jsonPath("eventStatus").value(EventStatus.DRAFT.name()))
        ;
    }

    @Test
    @TestDescription("입력받을 수 없는 값을 사용한 경우 이벤트 생성시 에러가 발생하는 테스트")
    public void createEvent_BadRequest() throws Exception {
        // 요청 파라미터
        Event event = Event.builder()
                .name("spring")
                .description("REST API Development with Spring")
                .beginEnrollmentDateTime(LocalDateTime.of(2018, 11, 23, 0, 0))
                .closeEnrollmentDateTime(LocalDateTime.of(2018, 11, 24, 0, 0))
                .beginEventDateTime(LocalDateTime.of(2018, 11, 25, 0, 0))
                .endEventDateTime(LocalDateTime.of(2018, 11, 26, 0, 0))
                .basePrice(100)
                .maxPrice(200)
                .limitOfEnrollment(100)
                .location("강남역 D2 스타텁 팩토리")

                // 요청에 아래 파라미터를 입력한다해도 실제로 동작하면 안됨
                .id(100)
                .free(true)
                .offline(false)
                .eventStatus(EventStatus.PUBLISHED)
                .build();

        mockMvc.perform(post("/api/events/")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaTypes.HAL_JSON)
                .content(objectMapper.writeValueAsString(event)))
                .andDo(print())
                .andExpect(status().isBadRequest())
        ;
    }

    @Test
    @TestDescription("입력값이 비어있는 경우 이벤트 생성시 에러가 발생하는 테스트")
    public void createEvent_BadRequest_EmptyInput() throws Exception {
        EventDto eventDto = EventDto.builder().build();
        mockMvc.perform(post("/api/events")
                    .contentType(MediaType.APPLICATION_JSON_UTF8)
                    .accept(MediaTypes.HAL_JSON)
                    .content(objectMapper.writeValueAsString(eventDto)))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

    @Test
    @TestDescription("입력값이 잘못된 경우 이벤트 생성시 에러가 발생하는 테스트")
    public void createEvent_BadRequest_WrongInput() throws Exception {
        // 요청 파라미터
        EventDto eventDto = EventDto.builder()
                .name("spring")
                .description("REST API Development with Spring")
                .beginEnrollmentDateTime(LocalDateTime.of(2018, 11, 26, 0, 0))
                .closeEnrollmentDateTime(LocalDateTime.of(2018, 11, 25, 0, 0))
                .beginEventDateTime(LocalDateTime.of(2018, 11, 24, 0, 0))
                .endEventDateTime(LocalDateTime.of(2018, 11, 23, 0, 0))
                .basePrice(10000)
                .maxPrice(200)
                .limitOfEnrollment(100)
                .location("강남역 D2 스타텁 팩토리")
                .build();

        mockMvc.perform(post("/api/events")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaTypes.HAL_JSON)
                .content(objectMapper.writeValueAsString(eventDto)))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$[0].objectName").exists())
//                .andExpect(jsonPath("$[0].field").exists())
                .andExpect(jsonPath("$[0].defaultMessage").exists())
                .andExpect(jsonPath("$[0].code").exists())
//                .andExpect(jsonPath("$[0].rejectedValue").exists())
        ;
    }
}
