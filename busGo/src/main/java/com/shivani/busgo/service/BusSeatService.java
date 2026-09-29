package com.shivani.busgo.service;

import com.shivani.busgo.model.BusSeat;
import com.shivani.busgo.repository.BusSeatRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BusSeatService {

    private final BusSeatRepository busSeatRepository;

    public BusSeatService(BusSeatRepository busSeatRepository) {
        this.busSeatRepository = busSeatRepository;
    }

    public Flux<BusSeat> getAllSeats() {
        return busSeatRepository.findAll();
    }

    public Mono<BusSeat> getSeatById(Long id) {
        return busSeatRepository.findById(id);
    }

    public Mono<BusSeat> createSeat(BusSeat busSeat) {
        return busSeatRepository.save(busSeat);
    }
}