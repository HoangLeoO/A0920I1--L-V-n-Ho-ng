package com.example.thi_modul4.service;

import com.example.thi_modul4.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAllProduct(Pageable pageable);

    Product findById(Long id);

    void save(Product product);

    void deleteById(Long id);

    Page<Product> findByName(String name,Pageable pageable);

    Page<Product> findByPrice(String price,Pageable pageable);
}
