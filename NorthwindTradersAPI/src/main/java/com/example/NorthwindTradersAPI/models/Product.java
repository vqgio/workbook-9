package com.example.NorthwindTradersAPI.models;

public class Product {
    int productId;
    String productName;
    int categoryId;
    double unitPrice;

    public Product(int productId, String productName, int categoryId, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }
    //region getters.
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    //endregion
}
