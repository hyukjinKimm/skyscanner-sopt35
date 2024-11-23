package sopt35.skyscanner.dto;

import java.util.List;

public class PriceListResponse {

    private String month; // 예: "2024-11"
    private List<PriceResponse> prices;

    public PriceListResponse(String month, List<PriceResponse> prices) {
        this.month = month;
        this.prices = prices;
    }

    public List<PriceResponse> getPrices() {
        return prices;
    }

    public String getMonth() {
        return month;
    }

    public void setPrices(List<PriceResponse> prices) {
        this.prices = prices;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
