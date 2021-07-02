package com.example.blog_1.controller;

import com.example.blog_1.model.Blog;
import com.example.blog_1.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService ;

    @GetMapping("/")
    public ModelAndView getListBlog(@PageableDefault(value = 5) Pageable pageable){
        Page<Blog> blogList = blogService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/blog/index","blogs",blogList);
        return modelAndView;
    }
}
