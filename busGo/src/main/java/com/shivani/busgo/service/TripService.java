package com.shivani.busgo.service;
import com.shivani.busgo.dto.TripSearchRequest;
import java.time.Duration;

import com.shivani.busgo.model.Trip;
import com.shivani.busgo.repository.TripRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.shivani.busgo.dto.TripSearchResponse;

@Service
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Flux<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    public Mono<Trip> getTripById(Long id) {
        return tripRepository.findById(id);
    }
    public Flux<TripSearchResponse> searchTrips(TripSearchRequest request) {
        return tripRepository.searchTrips(
                request.getSourceLocationId(),
                request.getDestinationLocationId(),
                request.getJourneyDate(),
                request.getBusType()
        ).map(response -> {

            Duration duration = Duration.between(
                    response.getDepartureTime(),
                    response.getArrivalTime()
            );

            long hours = duration.toHours();
            long minutes = duration.toMinutesPart();

            response.setDuration(hours + "h " + minutes + "m");

            return response;
        });
    }
}