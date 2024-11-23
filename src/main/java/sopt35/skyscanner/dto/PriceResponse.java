package sopt35.skyscanner.dto;

import java.time.LocalDate;

public class PriceResponse {

    private long id;
    private LocalDate date;
    private Float price;

    public PriceResponse(long id, LocalDate date, Float price) {
        this.id = id;
        this.date = date;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public Float getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
