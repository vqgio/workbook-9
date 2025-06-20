package com.example.NorthwindTradersAPI.dao;

import com.example.NorthwindTradersAPI.models.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int id);
}
