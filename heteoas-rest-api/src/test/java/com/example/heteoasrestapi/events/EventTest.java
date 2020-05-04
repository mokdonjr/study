package com.example.heteoasrestapi.events;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

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

    private Object[] parametersForTestFree() { // 메서드 이름 컨벤션이 존재
        return new Object[] {
                new Object[] {0, 0, true},
                new Object[] {100, 0, false},
                new Object[] {0, 100, false},
                new Object[] {100, 200, false},
        };
    }

    @Test
    @Parameters
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

    private Object[] parametersForTestOffline() {
        return new Object[] {
                new Object[] {"강남역 네이버 D2 스타텁 팩토리", true},
                new Object[] {null, false},
                new Object[] {" ", false},
        };
    }

    @Test
    @Parameters
    public void testOffline(String location, boolean isOffline) {
        // given
        Event event = Event.builder()
                .location(location)
                .build();

        // when
        event.update();

        // then
        assertThat(event.isOffline()).isEqualTo(isOffline);
    }

}