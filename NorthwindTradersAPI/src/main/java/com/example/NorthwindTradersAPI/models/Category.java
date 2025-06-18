package com.example.NorthwindTradersAPI.models;

public class Category {
    int categoryId;
    String categoryName;

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    //region getters.
    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
    //endregion
}
