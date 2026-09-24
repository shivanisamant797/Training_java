package com.example.webfluxcrud.repository;

import com.example.webfluxcrud.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {

}
