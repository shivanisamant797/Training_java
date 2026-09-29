package com.shivani.busgo.controller;

import com.shivani.busgo.model.Bus;
import com.shivani.busgo.service.BusService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/buses")
public class BusController {

    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public Flux<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/{id}")
    public Mono<Bus> getBusById(@PathVariable Long id) {
        return busService.getBusById(id);
    }
}