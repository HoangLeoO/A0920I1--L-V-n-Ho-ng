package com.example.bai2.repository;

import com.example.bai2.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findByName(String name , Pageable pageable);
    Page<Customer> findAll(Pageable pageable);
}
