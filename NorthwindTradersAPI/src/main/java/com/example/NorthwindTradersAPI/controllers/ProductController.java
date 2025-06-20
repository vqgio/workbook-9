package com.example.NorthwindTradersAPI.controllers;

import com.example.NorthwindTradersAPI.dao.CategoryDao;
import com.example.NorthwindTradersAPI.dao.ProductDao;
import com.example.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productDao.getAll();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productDao.getById(id);
    }
}
