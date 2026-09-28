package com.shivani.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private int prodId;
    private String prodName;
    private int price;

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }
}
