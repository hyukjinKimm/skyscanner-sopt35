package sopt35.skyscanner.dto;

import java.util.List;

public class CardListResponse {
    private final List<CardResponse> cardResponseList;

    // 생성자: List<Card>를 받아서 CardResponse 객체 리스트로 변환
    public CardListResponse(List<CardResponse> cardResponseList) {
        this.cardResponseList = cardResponseList;
    }

    // Getter and Setter
    public List<CardResponse> getCardResponseList() {
        return cardResponseList;
    }
}
