package com.example.thi_modul4.service.impl;

import com.example.thi_modul4.model.Product;
import com.example.thi_modul4.repository.ProductRepository;
import com.example.thi_modul4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository ;

    @Override
    public Page<Product> findAllProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findByName(String name, Pageable pageable) {
        return productRepository.findByName(name,pageable);
    }

    @Override
    public Page<Product> findByPrice(String price, Pageable pageable) {
        return productRepository.findByPrice(price,pageable);
    }

}
