package sopt35.skyscanner.dto;

public class FlightResponse {

    private Long id;
    private String airline;
    private String airlineUrl;
    private String departAt;
    private String arriveAt;
    private String depFlightTimeline;
    private String depFlightTime;
    private String depAirport;
    private String arrFlightTimeline;
    private String arrFlightTime;
    private String arrAirport;
    private float totalPrice; // arrPrice + depPrice


    public FlightResponse(Long id, String airline, String airlineUrl, String departAt, String arriveAt,
                          String depFlightTimeline, String depFlightTime, String depAirport,
                          String arrFlightTimeline, String arrFlightTime, String arrAirport, float totalPrice) {
        this.id = id;
        this.airline = airline;
        this.airlineUrl = airlineUrl;
        this.departAt = departAt;
        this.arriveAt = arriveAt;
        this.depFlightTimeline = depFlightTimeline;
        this.depFlightTime = depFlightTime;
        this.depAirport = depAirport;
        this.arrFlightTimeline = arrFlightTimeline;
        this.arrFlightTime = arrFlightTime;
        this.arrAirport = arrAirport;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirlineUrl() {
        return airlineUrl;
    }

    public void setAirlineUrl(String airlineUrl) {
        this.airlineUrl = airlineUrl;
    }

    public String getDepartAt() {
        return departAt;
    }

    public void setDepartAt(String departAt) {
        this.departAt = departAt;
    }

    public String getArriveAt() {
        return arriveAt;
    }

    public void setArriveAt(String arriveAt) {
        this.arriveAt = arriveAt;
    }

    public String getDepFlightTimeline() {
        return depFlightTimeline;
    }

    public void setDepFlightTimeline(String depFlightTimeline) {
        this.depFlightTimeline = depFlightTimeline;
    }

    public String getDepFlightTime() {
        return depFlightTime;
    }

    public void setDepFlightTime(String depFlightTime) {
        this.depFlightTime = depFlightTime;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }

    public String getArrFlightTimeline() {
        return arrFlightTimeline;
    }

    public void setArrFlightTimeline(String arrFlightTimeline) {
        this.arrFlightTimeline = arrFlightTimeline;
    }

    public String getArrFlightTime() {
        return arrFlightTime;
    }

    public void setArrFlightTime(String arrFlightTime) {
        this.arrFlightTime = arrFlightTime;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public void setArrAirport(String arrAirport) {
        this.arrAirport = arrAirport;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}

