package com.shivani.busgo.controller;

import com.shivani.busgo.model.Trip;
import com.shivani.busgo.service.TripService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.shivani.busgo.dto.TripSearchRequest;
import org.springframework.web.bind.annotation.RequestBody;
import com.shivani.busgo.dto.TripSearchResponse;

@RestController
@RequestMapping("/trips")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public Flux<Trip> getAllTrips() {
        return tripService.getAllTrips();
    }

    @GetMapping("/{id}")
    public Mono<Trip> getTripById(@PathVariable Long id) {
        return tripService.getTripById(id);
    }
    @PostMapping("/search")
    public Flux<TripSearchResponse> searchTrips(@RequestBody TripSearchRequest request) {
        return tripService.searchTrips(request);
    }
}