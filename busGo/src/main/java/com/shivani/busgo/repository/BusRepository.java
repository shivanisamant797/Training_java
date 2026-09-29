package com.shivani.busgo.repository;

import com.shivani.busgo.model.Bus;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BusRepository extends ReactiveCrudRepository<Bus, Long> {
}