package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void DeleteById(int id);
    void Save(Customer customer);
}
