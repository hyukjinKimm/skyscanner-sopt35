package sopt35.skyscanner.service;

import java.util.List;
import org.springframework.stereotype.Service;
import sopt35.skyscanner.repository.Flight;
import sopt35.skyscanner.repository.FlightRepository;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlight() {
        List<Flight> flights = flightRepository.findAll();
        System.out.println(flights);
        return flights;
    }

}
