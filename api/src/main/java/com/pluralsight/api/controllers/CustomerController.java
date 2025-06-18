package com.pluralsight.api.controllers;

import com.pluralsight.api.CustomerDao;
import com.pluralsight.api.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController
{
    private CustomerDao dao;
    @Autowired
    public CustomerController(CustomerDao dao)
    {
        this.dao = dao;
    }
    @RequestMapping(path="/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers()
    {
        var customers = dao.getAll();
        return customers;
    }
    @RequestMapping(path="/customers/{id}",
            method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable String id)
    {
        Customer customer = dao.findByCustomerId(id);
        return customer;
    }
}

