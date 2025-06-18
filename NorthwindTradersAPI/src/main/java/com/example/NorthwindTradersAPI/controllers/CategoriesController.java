package com.example.NorthwindTradersAPI.controllers;

import com.example.NorthwindTradersAPI.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoriesController {
    List<Category> categories = new ArrayList<>();

    public CategoriesController() {
        categories.add(new Category(1, "Dairy"));
        categories.add(new Category(2, "Produce"));
        categories.add(new Category(3, "Meat"));
    }
    @GetMapping
    public List<Category> getAllCategories() {
        return new ArrayList<>(categories);
    }
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        for (Category category : categories) {
            if(category.getCategoryId() == id) {
                return category;
            }
        }
        return null;
    }
}
