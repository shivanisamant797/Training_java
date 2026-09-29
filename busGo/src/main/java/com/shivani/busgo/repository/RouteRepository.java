package com.shivani.busgo.repository;

import com.shivani.busgo.model.Route;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RouteRepository extends ReactiveCrudRepository<Route, Long> {
}