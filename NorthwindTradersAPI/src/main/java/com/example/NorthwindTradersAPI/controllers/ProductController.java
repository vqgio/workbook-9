package com.example.NorthwindTradersAPI.controllers;

import com.example.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1, "String Cheese", 1, 4.99));
        products.add(new Product(2, "Milk", 1, 2.50));
        products.add(new Product(3, "Apples", 2, 0.50));
    }
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
    @GetMapping("products/{id}")
    public Product getProductById(@PathVariable int id) {
        for (Product product : products) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }
}
