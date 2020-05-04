package com.example.heteoasrestapi.events;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // junit4
@WebMvcTest // web 관련 bean들이 등록
public class EventControllerTests {

    // mocking이 되어있는 dispacher servlet 을 이용해
    // request 를 테스트할 수 있는 bean
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    EventRepository eventRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void createEvent() throws Exception {
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
                .build();

        event.setId(10);
        Mockito.when(eventRepository.save(event)).thenReturn(event);

        mockMvc.perform(post("/api/events/")
                    .contentType(MediaType.APPLICATION_JSON_UTF8)
                    .accept(MediaTypes.HAL_JSON)
                    .content(objectMapper.writeValueAsString(event)))
                .andDo(print())
                .andExpect(status().isCreated()) // stateus().is(201)
                .andExpect(jsonPath("id").exists());
    }
}
