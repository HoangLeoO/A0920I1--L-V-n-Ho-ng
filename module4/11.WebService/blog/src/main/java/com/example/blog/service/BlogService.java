package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findByTitle(String title ,Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

    void update(Blog blog);
}
