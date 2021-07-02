package com.example.thuc_hanh_1.repository;

import com.example.thuc_hanh_1.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findByName(String name, Pageable pageable);
}
