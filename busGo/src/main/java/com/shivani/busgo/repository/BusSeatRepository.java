package com.shivani.busgo.repository;

import com.shivani.busgo.model.BusSeat;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface BusSeatRepository extends ReactiveCrudRepository<BusSeat, Long> {

    @Query("""
        SELECT *
        FROM bus_seats
        ORDER BY bus_id, CAST(seat_number AS INTEGER)
    """)
    Flux<BusSeat> findAllOrdered();
}