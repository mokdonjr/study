package com.example.heteoasrestapi.events;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder @AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of = "id") // 절대 참조관계 필드는 of 로 넣지 않기 stackoverflow 발생
//@Data // EqualsAndHashCode 구현시 모든 필드를 다 포함시켜 참조관계 필드가 있으면 stackoverflow 발생
@Entity // DB 저장
public class Event {

    @Id @GeneratedValue
    private Integer id; // PK
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime; // 이벤트 등록 시작 일시
    private LocalDateTime closeEnrollmentDateTime; // 이벤트 등록 종료 일시
    private LocalDateTime beginEventDateTime; // 이벤트 시작 일시
    private LocalDateTime endEventDateTime; // 이벤트 종료 일시
    private String location; // (optional) 이게 없으면 온라인 모임
    private int basePrice; // (optional)
    private int maxPrice; // (optional)
    private int limitOfEnrollment;
    private boolean offline;
    private boolean free;

    // enum의 순서가 바뀔 수 있기 때문에 ordinal 에서 string 으로 바꾸는게 좋음.
    @Enumerated(EnumType.STRING)
    private EventStatus eventStatus = EventStatus.DRAFT;
}
