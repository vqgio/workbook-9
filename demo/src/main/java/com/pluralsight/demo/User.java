package com.pluralsight.demo;

public class User {
    private int id;
    private String name;
    private String language;

    public User() {}  // No-arg constructor

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

}
