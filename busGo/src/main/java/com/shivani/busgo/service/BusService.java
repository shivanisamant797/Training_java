package com.shivani.busgo.service;

import com.shivani.busgo.model.Bus;
import com.shivani.busgo.repository.BusRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BusService {

    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public Flux<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Mono<Bus> getBusById(Long id) {
        return busRepository.findById(id);
    }
}