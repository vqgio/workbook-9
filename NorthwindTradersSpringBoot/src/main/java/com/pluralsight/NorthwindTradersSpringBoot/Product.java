package com.pluralsight.NorthwindTradersSpringBoot;

public class Product {
    int productId;
    String name;
    String category;
    double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int productId, String name, double price, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product ID: " + productId + "\nName: " + name + "\nCategory: " + category + "\nPrice: $" + price + "\n=============================";
    }

}
