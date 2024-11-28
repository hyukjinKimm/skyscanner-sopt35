package sopt35.skyscanner.dto;

import java.time.LocalDate;

public class PriceResponse {

    private long id;
    private LocalDate date;
    private Float price;
    private String color;

    public PriceResponse(long id, LocalDate date, Float price) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.color = determineColor(price);
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

    public String getColor() {
        return color;
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

    public void setColor(String color) {
        this.color = color;
    }

    // 가격에 따라 색상을 결정하는 메서드
    private String determineColor(Float price) {

        float RedThreshold = 32.95F;
        float OrangeThreshold = 17.58F;

        if(price == null){
            return "None";
        }

        if (price >= RedThreshold) { // 32.95만원 이상
            return "r";
        } else if (price >= OrangeThreshold) { // 17.58만원 이상
            return "o";
        } else { // 17.58만원 미만
            return "g";
        }
    }
}
