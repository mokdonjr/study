package com.example.heteoasrestapi.events;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
@RunWith(JUnitParamsRunner.class)
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
    @Parameters({
            "0, 0, true",
            "100, 0, false",
            "0, 100, false",
    })
    public void testFree(int basePrice, int maxPrice, boolean isFree) {
        // given
        Event event = Event.builder()
                .basePrice(basePrice)
                .maxPrice(maxPrice)
                .build();

        // when
        event.update();

        // then
        assertThat(event.isFree()).isEqualTo(isFree);
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