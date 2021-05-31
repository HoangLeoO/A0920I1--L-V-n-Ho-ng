package com.example.bai2.service;

import com.example.bai2.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(int id);
    void save(Customer customer);
    void remove(int id);
    Page<Customer> findByName(String name ,Pageable pageable);
}
