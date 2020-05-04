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

    @Test
    public void testFree() {
        // given
        Event event = Event.builder()
                .basePrice(0)
                .maxPrice(0)
                .build();

        // when
        event.update();

        // then
        assertThat(event.isFree()).isTrue();

        // given
        event = Event.builder()
                .basePrice(100)
                .maxPrice(0)
                .build();

        // when
        event.update();

        // then
        assertThat(event.isFree()).isFalse();

        // given
        event = Event.builder()
                .basePrice(0)
                .maxPrice(100)
                .build();

        // when
        event.update();

        // then
        assertThat(event.isFree()).isFalse();
    }

    @Test
    public void testOffline() {
        // given
        Event event = Event.builder()
                .location("강남역 네이버 D2 스타텁 팩토리")
                .build();

        // when
        event.update();

        // then
        assertThat(event.isOffline()).isTrue();

        // given
        event = Event.builder()
                .build();

        // when
        event.update();

        // then
        assertThat(event.isOffline()).isFalse();
    }
}