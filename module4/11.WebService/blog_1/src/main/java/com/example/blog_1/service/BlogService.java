package com.example.blog_1.service;

import com.example.blog_1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findByName(String name ,Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

    void update(Blog blog);
}
