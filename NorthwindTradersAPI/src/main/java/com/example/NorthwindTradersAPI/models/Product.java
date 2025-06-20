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

    public int getCategoryId(String categoryID) {
        return categoryId;
    }

    public double getUnitPrice(String unitPrice) {
        return this.unitPrice;
    }
    //endregion

    public String toString() {
        return("Product ID: " + productId + "Product Name: " + productName +
                "\nCategory ID: " + categoryId + "Price: " + unitPrice);
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
