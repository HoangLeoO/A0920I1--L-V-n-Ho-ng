package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findByAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    void update(Customer customer);
}
