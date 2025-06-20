package com.example.NorthwindTradersAPI.dao;

import com.example.NorthwindTradersAPI.models.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getAll();
    Category getById(int id);
}
