package com.example.bai_1.service;

import com.example.bai_1.model.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
}
