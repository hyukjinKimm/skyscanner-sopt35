package sopt35.skyscanner.dto;

public class WishResponse {

    private Long id;

    private String backgroundImageUrl;

    private String airlineUrl;

    private String departure;

    private String arrival;

    private String airline;

    private String depFlightTimeline;

    private String depFlightTime;

    private String depAirport;

    private String arrFlightTimeline;

    private String arrFlightTime;

    private String arrAirport;

    private String travelDays;

    private Integer person;

    private String price;

    public WishResponse(
            Long id,
            String backgroundImageUrl,
            String airlineUrl,
            String departure,
            String arrival,
            String airline,
            String depFlightTimeline,
            String depFlightTime,
            String depAirport,
            String arrFlightTimeline,
            String arrFlightTime,
            String arrAirport,
            String travelDays,
            Integer person,
            String price
    ) {
        this.id = id;
        this.backgroundImageUrl = backgroundImageUrl;
        this.airlineUrl = airlineUrl;
        this.departure = departure;
        this.arrival = arrival;
        this.airline = airline;
        this.depFlightTimeline = depFlightTimeline;
        this.depFlightTime = depFlightTime;
        this.depAirport = depAirport;
        this.arrFlightTimeline = arrFlightTimeline;
        this.arrFlightTime = arrFlightTime;
        this.arrAirport = arrAirport;
        this.travelDays = travelDays;
        this.person = person;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    public String getAirlineUrl() {
        return airlineUrl;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getAirline() {
        return airline;
    }

    public String getDepFlightTimeline() {
        return depFlightTimeline;
    }

    public String getDepFlightTime() {
        return depFlightTime;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public String getArrFlightTimeline() {
        return arrFlightTimeline;
    }

    public String getArrFlightTime() {
        return arrFlightTime;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public String getTravelDays() {
        return travelDays;
    }

    public Integer getPerson() {
        return person;
    }

    public String getPrice() {
        return price;
    }
}

