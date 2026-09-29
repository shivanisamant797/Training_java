package com.shivani.busgo.controller;

import com.shivani.busgo.model.Location;
import com.shivani.busgo.service.LocationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public Flux<Location> getAllLocations() {
        return locationService.getAllLocations();
    }
}