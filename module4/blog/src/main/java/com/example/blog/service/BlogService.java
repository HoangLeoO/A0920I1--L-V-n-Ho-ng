package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAllBlog();
    Blog findByIdBlog(int id);
    void save(Blog blog);
    void remove(int id);
}
