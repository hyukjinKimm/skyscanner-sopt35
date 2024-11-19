package sopt35.skyscanner.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sopt35.skyscanner.dto.CardListResponse;
import sopt35.skyscanner.dto.CardResponse;
import sopt35.skyscanner.service.CardService;

@RestController
@RequestMapping("/card")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/")
    public ResponseEntity<CardListResponse> get() {
        List<CardResponse> cardResponseList = cardService.getAllCards();
        return ResponseEntity.ok(new CardListResponse(cardResponseList));
    }
}
