package sopt35.skyscanner.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 출발지 : 서울 고정
    private String departAt;

    // 여행 목적지 : 오키나와 고정
    private String arriveAt;

    // 출발하는 항공편의 이륙 시간
    private LocalDateTime depTime1;

    // 출발하는 항공편의 착륙 시간
    private LocalDateTime arrTime1;

    // 도착하는 항공편의 이륙 시간
    private LocalDateTime depTime2;

    // 도착하는 항공편의 착륙 시간
    private LocalDateTime arrTime2;

    // 출발하는 항공편의 가격.. 10만원 ~ 15만원 사이
    private float depPrice;

    // 도착하는 항공편의 가격.. 10만원 ~ 15만원 사이
    private float arrPrice;

    // 항공사
    private String airline;

    // 좋아요 여부 : 초기값 false
    private Boolean isLike;

    // 인원수 1명 ~ 4명
    private int count;

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public String getDepartAt() {
        return departAt;
    }

    public String getArriveAt() {
        return arriveAt;
    }

    public LocalDateTime getDepTime1() {
        return depTime1;
    }

    public LocalDateTime getArrTime1() {
        return arrTime1;
    }

    public LocalDateTime getDepTime2() {
        return depTime2;
    }

    public LocalDateTime getArrTime2() {
        return arrTime2;
    }

    public float getDepPrice() {
        return depPrice;
    }

    public float getArrPrice() {
        return arrPrice;
    }

    public String getAirline() {
        return airline;
    }

    public Boolean getLike() {
        return isLike;
    }

    public int getCount() {
        return count;
    }

    public void updateLike() {
        isLike = !isLike;
    }
}