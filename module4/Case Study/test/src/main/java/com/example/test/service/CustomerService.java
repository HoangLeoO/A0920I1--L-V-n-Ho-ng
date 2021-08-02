package com.example.test.service;

import com.example.test.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    Page<Customer> findAllCustomer(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void deleteById(Long id);

    Page<Customer> findByName(String name,Pageable pageable);
}
