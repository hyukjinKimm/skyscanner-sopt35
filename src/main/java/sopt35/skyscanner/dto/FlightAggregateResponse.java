package sopt35.skyscanner.dto;

import java.util.List;

public class FlightAggregateResponse {
    private List<FlightResponse> flights;
    private float averageTotalPrice;

    public FlightAggregateResponse(List<FlightResponse> flights, float averageTotalPrice) {
        this.flights = flights;
        this.averageTotalPrice = averageTotalPrice;
    }

    // Getter and Setter

    public List<FlightResponse> getFlights() {
        return flights;
    }

    public float getAverageTotalPrice() {
        return averageTotalPrice;
    }

    public void setFlights(List<FlightResponse> flights) {
        this.flights = flights;
    }

    public void setAverageTotalPrice(float averageTotalPrice) {
        this.averageTotalPrice = averageTotalPrice;
    }
}

