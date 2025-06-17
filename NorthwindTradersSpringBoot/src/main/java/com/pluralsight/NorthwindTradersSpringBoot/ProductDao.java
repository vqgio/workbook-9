package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    List<Product> getAll();
}
