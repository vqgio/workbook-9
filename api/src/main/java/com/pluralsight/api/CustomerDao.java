package com.pluralsight.api;

import com.pluralsight.api.models.Customer;

import java.util.List;

public interface CustomerDao {
    public Customer findByCustomerId(String id);
    public List<Customer> getAll();
}
