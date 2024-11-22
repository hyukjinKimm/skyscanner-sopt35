package sopt35.skyscanner.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sopt35.skyscanner.dto.WishListResponse;
import sopt35.skyscanner.repository.Flight;
import sopt35.skyscanner.service.FlightService;

@RestController
@RequestMapping("/")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/wishlist")
    public WishListResponse getWishList() {
        return flightService.getWishList();
    }

    @PatchMapping("/wishlist")
    public void patchWishList(@RequestParam Long flightId) {
        flightService.updateWishList(flightId);
    }
}
