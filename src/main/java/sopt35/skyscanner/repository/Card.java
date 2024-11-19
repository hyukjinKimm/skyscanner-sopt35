package sopt35.skyscanner.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    // 게터/세터 메서드

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDepartureAirlineImageUrl() {
        return departureAirlineImageUrl;
    }

    public void setDepartureAirlineImageUrl(String departureAirlineImageUrl) {
        this.departureAirlineImageUrl = departureAirlineImageUrl;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTicketDescription() {
        return departureTicketDescription;
    }

    public void setDepartureTicketDescription(String departureTicketDescription) {
        this.departureTicketDescription = departureTicketDescription;
    }

    public String getArrivalAirlineImageUrl() {
        return arrivalAirlineImageUrl;
    }

    public void setArrivalAirlineImageUrl(String arrivalAirlineImageUrl) {
        this.arrivalAirlineImageUrl = arrivalAirlineImageUrl;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTicketDescription() {
        return arrivalTicketDescription;
    }

    public void setArrivalTicketDescription(String arrivalTicketDescription) {
        this.arrivalTicketDescription = arrivalTicketDescription;
    }
}