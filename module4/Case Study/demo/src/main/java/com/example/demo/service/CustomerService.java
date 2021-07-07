package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomer();

    Customer findByIdCustomer(int id);

    void save(Customer customer);

    void remove(int id);
}
