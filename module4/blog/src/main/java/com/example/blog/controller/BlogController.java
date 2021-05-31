package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping("/index")
    public ModelAndView index(){
        List<Blog> blogList = blogService.findAllBlog();
        ModelAndView modelAndView = new ModelAndView("/blog/index","blog",blogList);
        return modelAndView;
    }
    @GetMapping("/create-blog")
    public ModelAndView showFrom(){
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog",new Blog());
        return modelAndView;
    }
    @PostMapping("/create-blog")
    public String createBlog(Blog blog){
        blogService.save(blog);
        return "redirect:/index";
    }

}
