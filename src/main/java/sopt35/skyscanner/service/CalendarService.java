package sopt35.skyscanner.service;

import org.springframework.stereotype.Service;
import sopt35.skyscanner.dto.PriceListResponse;
import sopt35.skyscanner.dto.PriceResponse;
import sopt35.skyscanner.repository.Price;
import sopt35.skyscanner.repository.PriceRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CalendarService {

    PriceRepository priceRepository;

    public CalendarService(PriceRepository priceRepository){
        this.priceRepository = priceRepository;
    }

    public List<PriceListResponse> getPriceGroupByMonth(){

        List<Price> prices = priceRepository.findAll(); // DB의 모든 Price 데이터 가져옴

        // Stream API로 Price를 월별로 그룹화함
        Map<String, List<PriceResponse>> groupedByMonth = prices.stream()
                .map(price -> new PriceResponse(price.getId(), price.getDate(), price.getPrice())) // DTO 변환
                .collect(Collectors.groupingBy(
                        price -> price.getDate().getYear() + "-" + price.getDate().getMonthValue() // YYYY-MM 형태로 월 구분
                ));

        // 그룹화된 데이터를 PriceListResponse로 변환함
        return groupedByMonth.entrySet().stream()
                .map(entry -> new PriceListResponse(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }
}
