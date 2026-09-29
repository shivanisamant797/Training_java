package com.shivani.busgo.service;

import com.shivani.busgo.model.Location;
import com.shivani.busgo.repository.LocationRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Flux<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}