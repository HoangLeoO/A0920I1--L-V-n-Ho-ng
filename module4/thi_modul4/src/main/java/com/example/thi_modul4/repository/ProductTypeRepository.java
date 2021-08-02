package com.example.thi_modul4.repository;

import com.example.thi_modul4.model.ProductType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType,Long> {
    Page<ProductType> findByName(String name, Pageable pageable);
    Page<ProductType> findAll(Pageable pageable);
}
