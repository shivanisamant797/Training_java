package com.shivani.busgo.controller;

import com.shivani.busgo.model.Route;
import com.shivani.busgo.service.RouteService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/routes")
public class RouteController {

    private final RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping
    public Flux<Route> getAllRoutes() {
        return routeService.getAllRoutes();
    }

    @GetMapping("/{id}")
    public Mono<Route> getRouteById(@PathVariable Long id) {
        return routeService.getRouteById(id);
    }
}