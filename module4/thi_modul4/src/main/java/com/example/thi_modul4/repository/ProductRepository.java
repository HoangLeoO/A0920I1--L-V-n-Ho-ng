package com.example.thi_modul4.repository;

import com.example.thi_modul4.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Page<Product> findByName(String name, Pageable pageable);
    Page<Product> findByPrice(String price, Pageable pageable);
    Page<Product> findAll(Pageable pageable);
}
