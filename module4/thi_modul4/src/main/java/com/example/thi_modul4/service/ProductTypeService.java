package com.example.thi_modul4.service;

import com.example.thi_modul4.model.Product;
import com.example.thi_modul4.model.ProductType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> findAll();

    Page<ProductType> findByName(String name, Pageable pageable);

    Page<ProductType> findAllProductType(Pageable pageable);
}
