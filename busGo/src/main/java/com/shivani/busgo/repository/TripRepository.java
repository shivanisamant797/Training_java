package com.shivani.busgo.repository;

import com.shivani.busgo.model.Trip;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.r2dbc.repository.Query;
import reactor.core.publisher.Flux;
import com.shivani.busgo.dto.TripSearchResponse;

import java.time.LocalDate;

public interface TripRepository extends ReactiveCrudRepository<Trip, Long> {

    @Query("""
    SELECT
        t.id AS trip_id,
        b.bus_number AS bus_number,
        b.operator_name AS operator_name,
        b.bus_type AS bus_type,
        t.departure_time AS departure_time,
        t.arrival_time AS arrival_time,
        t.price AS price
    FROM trips t
    JOIN routes r ON t.route_id = r.id
    JOIN buses b ON t.bus_id = b.id
    WHERE r.source_location_id = :sourceLocationId
      AND r.destination_location_id = :destinationLocationId
      AND t.journey_date = :journeyDate
      AND (
          :busType IS NULL
          OR (:busType = 'AC' AND b.bus_type LIKE 'AC%')
          OR (:busType = 'Sleeper' AND b.bus_type LIKE '%Sleeper%')
          OR (:busType = 'Seater' AND b.bus_type LIKE '%Seater%')
      )
    """)
    Flux<TripSearchResponse> searchTrips(
            Long sourceLocationId,
            Long destinationLocationId,
            LocalDate journeyDate,
            String busType
    );
}