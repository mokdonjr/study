package com.example.heteoasrestapi.events;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EventTest {

    @Test
    public void builder() {
        // Given
        String name = "test event name";
        String description = "test event description";

        // When
        Event event = Event.builder()
                .name(name)
                .description(description)
                .build();

        // Then
        assertThat(event).isNotNull();
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }

    @Test
    public void javaBean() {
        // Given
        String name = "test event name";
        String description = "test event description";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        // Then
        assertThat(event).isNotNull();
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }
}