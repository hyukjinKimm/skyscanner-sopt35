package sopt35.skyscanner.service;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sopt35.skyscanner.dto.WishListResponse;
import sopt35.skyscanner.dto.WishResponse;
import sopt35.skyscanner.repository.Flight;
import sopt35.skyscanner.repository.FlightRepository;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public WishListResponse getWishList() {
        List<Flight> flights = flightRepository.findAllByIsLikeTrue();

        List<WishResponse> wishResponses = flights.stream()
                .map(flight -> new WishResponse(
                        flight.getId(),
                        "https://github.com/user-attachments/assets/c95b0b23-9d7a-4bc4-8ffe-786c34c64a19",
                        "https://github-production-user-asset-6210df.s3.amazonaws.com/107605573/388411184-c6b5dbdf-e1d3-4eab-b920-63df54858b73.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20241122%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241122T082044Z&X-Amz-Expires=300&X-Amz-Signature=55db812447a5bbad1bc105980bde91469744e36aa4ac5f805b7f391e584fa665&X-Amz-SignedHeaders=host",
                        flight.getDepartAt(),
                        flight.getArriveAt(),
                        flight.getAirline(),
                        getTimeLine(flight.getDepTime1(), flight.getArrTime1()),
                        getFlightTime(flight.getDepTime1(), flight.getArrTime1()),
                        "ICN-OKA",
                        getTimeLine(flight.getDepTime2(), flight.getArrTime2()),
                        getFlightTime(flight.getDepTime2(), flight.getArrTime2()),
                        "OKA-ICN",
                        getTravelDays(flight.getDepTime1(), flight.getArrTime2()),
                        flight.getCount(),
                        getFlightPrice(flight.getDepPrice(), flight.getArrPrice())
                )).toList();

        return new WishListResponse(wishResponses);
    }

    @Transactional
    public void updateWishList(Long flightId) {
        Flight flight = flightRepository.findById(flightId)
                .orElseThrow();

        flight.updateLike();
    }

    private String getTimeLine(LocalDateTime depTime, LocalDateTime arrTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ah:mm", Locale.ENGLISH);

        String dep = depTime.format(formatter);
        String arr = arrTime.format(formatter);

        return dep + " - " + arr;
    }

    private String getFlightTime(LocalDateTime depTime, LocalDateTime arrTime) {
        Duration duration = Duration.between(depTime, arrTime);

        long hour = duration.toHours();
        long minute = duration.toMinutes() % 60;

        return hour + "시간 " + minute + "분";
    }

    private String getTravelDays(LocalDateTime depTime, LocalDateTime arrTime) {
        int depDay = depTime.getDayOfMonth();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.M.d");
        String arrDay = arrTime.format(formatter);

        return depDay + "일 - " + arrDay;
    }

    private String getFlightPrice(float arrPrice, float depPrice) {
        float flightPrice = arrPrice + depPrice;

        NumberFormat numberFormat = NumberFormat.getInstance();
        String formattedPrice = numberFormat.format(flightPrice);

        return "₩" + formattedPrice;
    }
}
