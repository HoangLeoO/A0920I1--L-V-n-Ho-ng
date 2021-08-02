package com.example.thi_modul4.service.impl;

import com.example.thi_modul4.model.ProductType;
import com.example.thi_modul4.repository.ProductTypeRepository;
import com.example.thi_modul4.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }

    @Override
    public Page<ProductType> findByName(String name, Pageable pageable) {
        return productTypeRepository.findByName(name,pageable);
    }

    @Override
    public Page<ProductType> findAllProductType(Pageable pageable) {
        return productTypeRepository.findAll(pageable);
    }
}
