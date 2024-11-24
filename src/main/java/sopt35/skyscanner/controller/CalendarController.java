package sopt35.skyscanner.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sopt35.skyscanner.dto.PriceListResponse;
import sopt35.skyscanner.service.CalendarService;

import java.util.List;

@RestController
public class CalendarController {

    private final CalendarService calendarService;

    public CalendarController(CalendarService calendarService){
        this.calendarService = calendarService;
    }

    // 월별 항공편 가격 반환 API
    @GetMapping("/calendar")
    public ResponseEntity<List<PriceListResponse>> getPriceByMonth() {

        List<PriceListResponse> prices = calendarService.getPriceGroupByMonth();
        return ResponseEntity.ok(prices);

    }

}
