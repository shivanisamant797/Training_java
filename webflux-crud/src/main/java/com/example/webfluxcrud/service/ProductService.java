package com.example.webfluxcrud.service;

import com.example.webfluxcrud.model.Product;
import com.example.webfluxcrud.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // CREATE
    public Mono<Product> createProduct(Product product) {
        return productRepository.save(product);
    }

    // READ - all products
    public Flux<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // READ - product by ID
    public Mono<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // UPDATE
    public Mono<Product> updateProduct(Long id, Product product) {
        return productRepository.findById(id)
                .flatMap(existingProduct -> {
                    existingProduct.setName(product.getName());
                    existingProduct.setPrice(product.getPrice());
                    existingProduct.setDescription(product.getDescription());

                    return productRepository.save(existingProduct);
                });
    }

    // DELETE
    public Mono<Void> deleteProduct(Long id) {
        return productRepository.deleteById(id);
    }
}