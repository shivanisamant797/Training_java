package com.shivani.busgo.service;

import com.shivani.busgo.model.Route;
import com.shivani.busgo.repository.RouteRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RouteService {

    private final RouteRepository routeRepository;

    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Flux<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Mono<Route> getRouteById(Long id) {
        return routeRepository.findById(id);
    }
}