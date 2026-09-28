package com.shivani.simpleWebApp.services;
import com.shivani.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

            List<Product> products= Arrays.asList(
                    new Product(101, "Iphone",5000),
                    new Product(102,"Canon Camera",7000),
                    new Product(103,"shrug mic",4000));

            public List<Product> getProdcuts(){
                return products;
            }


}


