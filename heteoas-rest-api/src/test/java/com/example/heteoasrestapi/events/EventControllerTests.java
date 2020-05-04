package com.example.heteoasrestapi.events;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // junit4
@WebMvcTest // web 관련 bean들이 등록
public class EventControllerTests {

    // mocking이 되어있는 dispacher servlet 을 이용해
    // request 를 테스트할 수 있는 bean
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void createEvent() throws Exception {
        mockMvc.perform(post("/api/events/")
                    .contentType(MediaType.APPLICATION_JSON_UTF8)
                    .accept(MediaTypes.HAL_JSON)
                    )
                .andExpect(status().isCreated()); // stateus()..is(201)
    }
}
