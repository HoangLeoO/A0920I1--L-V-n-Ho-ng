package com.example.repository;

import com.example.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    Customer findById(int id);
    void DeleteById(int id);
    void Save(Customer customer);
}
