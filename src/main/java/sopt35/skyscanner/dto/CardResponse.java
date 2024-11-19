package sopt35.skyscanner.dto;

import sopt35.skyscanner.repository.Card;

public class CardResponse {
    private long id;
    private String country;
    private String spot;
    private String price;
    private String departureAirlineImageUrl;
    private String departureDate;
    private String departureTicketDescription;
    private String arrivalAirlineImageUrl;
    private String arrivalDate;
    private String arrivalTicketDescription;

    // Card 객체를 받아서 초기화하는 생성자
    public CardResponse(Card card) {
        this.id = card.getId();
        this.country = card.getCountry();
        this.spot = card.getSpot();
        this.price = card.getPrice();
        this.departureAirlineImageUrl = card.getDepartureAirlineImageUrl();
        this.departureDate = card.getDepartureDate();
        this.departureTicketDescription = card.getDepartureTicketDescription();
        this.arrivalAirlineImageUrl = card.getArrivalAirlineImageUrl();
        this.arrivalDate = card.getArrivalDate();
        this.arrivalTicketDescription = card.getArrivalTicketDescription();
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
