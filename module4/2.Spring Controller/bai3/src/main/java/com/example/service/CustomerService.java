package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(String id);
    void delete(String id );
    void save(Customer customer);
}
