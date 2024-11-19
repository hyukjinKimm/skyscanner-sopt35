package sopt35.skyscanner.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import sopt35.skyscanner.dto.CardResponse;
import sopt35.skyscanner.repository.Card;
import sopt35.skyscanner.repository.CardRepository;

@Component
public class CardService {
    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }
    public List<CardResponse> getAllCards() {
        final List<Card> cardList = cardRepository.findAll();
        final List<CardResponse> cardResponseList = new ArrayList<>();
        for (Card card: cardList) {
            cardResponseList.add(new CardResponse(card));
        }
        return cardResponseList;
    }
}
