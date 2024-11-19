package sopt35.skyscanner.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String backgroundImageUrl;

    private String country;
    private String spot;

    private String price;

    // 출발 항공사 이미지 URL
    private String departureAirlineImageUrl;

    // 출발 날짜
    private String departureDate;

    // 출발 항공권 설명
    private String departureTicketDescription;

    // 도착 항공사 이미지 URL
    private String arrivalAirlineImageUrl;

    // 도착 날짜
    private String arrivalDate;

    // 도착 항공권 설명
    private String arrivalTicketDescription;

    // 기본 생성자
    public Card() {
    }

    // Getter 메서드

    public Long getId() {
        return id;
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    public String getCountry() {
        return country;
    }

    public String getSpot() {
        return spot;
    }

    public String getPrice() {
        return price;
    }

    public String getDepartureAirlineImageUrl() {
        return departureAirlineImageUrl;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTicketDescription() {
        return departureTicketDescription;
    }

    public String getArrivalAirlineImageUrl() {
        return arrivalAirlineImageUrl;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public String getArrivalTicketDescription() {
        return arrivalTicketDescription;
    }
}