package sopt35.skyscanner.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sopt35.skyscanner.repository.Flight;
import sopt35.skyscanner.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {

    private final FlightService flightService;


    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/")
    public List<Flight> get() {
        return flightService.getAllFlight();
    }
}
