package com.pluralsight.api;

import com.pluralsight.api.models.Customer;

import java.util.List;

public interface CustomerDao {
    Customer findByCustomerId(String id);
    List<Customer> getAll();
}
