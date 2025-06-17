package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {
     private final List<Product> products = new ArrayList<>();

    public SimpleProductDao() {
        // Pre-populating products
        products.add(new Product(1, "Laptop", 799.99, "Electronics"));
        products.add(new Product(2, "Coffee Maker", 49.99, "Appliances"));
        products.add(new Product(3, "Notebook", 4.99, "Stationary"));
        products.add(new Product(4, "Booty Rash Cream", 8.99, "Pharmacy"));
        products.add(new Product(5, "Barebell Protein Bar", 2.99, "Healthy Living"));
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products);
    }

}
