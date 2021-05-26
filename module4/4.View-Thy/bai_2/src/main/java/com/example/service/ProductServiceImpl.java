package com.example.service;

import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements  ProductService {
    public static Map<Integer,Product> products ;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Dien thoai",200000,10));
        products.put(2,new Product(2,"May tinh ",300000,12));
        products.put(3,new Product(3,"May tinh xach tay ",400000,9));
        products.put(4,new Product(4,"Tu lanh",200000,111));
    }
    @Autowired
    ProductService productService;
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }
}
