package com.example.thuc_hanh_1.service;

import com.example.thuc_hanh_1.exception.DuplicateEmailException;
import com.example.thuc_hanh_1.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
//    List<Customer> findAll() ;
    Page<Customer> findByName(String name, Pageable pageable) throws Exception;
//
    Customer findById(Long id);

    void save(Customer customer) throws DuplicateEmailException;

    void remove(Long id);


    Page<Customer> findAll(Pageable pageable);

    void update(Customer customer);

}
