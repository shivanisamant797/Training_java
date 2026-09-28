package com.shivani.simpleWebApp.controller;
import com.shivani.simpleWebApp.model.Product;
import java.util.List;
import com.shivani.simpleWebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @RequestMapping("/Products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
}
