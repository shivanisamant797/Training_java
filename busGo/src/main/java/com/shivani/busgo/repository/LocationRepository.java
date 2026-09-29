package com.shivani.busgo.repository;

import com.shivani.busgo.model.Location;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface LocationRepository extends ReactiveCrudRepository<Location, Long> {
}