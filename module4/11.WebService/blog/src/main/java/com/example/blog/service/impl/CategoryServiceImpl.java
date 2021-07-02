package com.example.blog.service.impl;

import com.example.blog.model.Category;
import com.example.blog.repository.CategoryRepository;
import com.example.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository ;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
