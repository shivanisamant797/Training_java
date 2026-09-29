package com.shivani.busgo.controller;

import com.shivani.busgo.model.BusSeat;
import com.shivani.busgo.service.BusSeatService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bus-seats")
public class BusSeatController {

    private final BusSeatService busSeatService;

    public BusSeatController(BusSeatService busSeatService) {
        this.busSeatService = busSeatService;
    }

    @GetMapping
    public Flux<BusSeat> getAllSeats() {
        return busSeatService.getAllSeats();
    }

    @GetMapping("/{id}")
    public Mono<BusSeat> getSeatById(@PathVariable Long id) {
        return busSeatService.getSeatById(id);
    }

    @PostMapping
    public Mono<BusSeat> createSeat(@RequestBody BusSeat busSeat) {
        return busSeatService.createSeat(busSeat);
    }
}