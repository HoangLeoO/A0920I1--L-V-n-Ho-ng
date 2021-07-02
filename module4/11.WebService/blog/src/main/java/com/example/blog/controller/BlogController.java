package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/Blog-Create")
    public ModelAndView showFromAddBlog(){
        Blog blog = new Blog();
        ModelAndView modelAndView = new ModelAndView("/blog/create","blog",blog);
        return modelAndView ;
    }

    @PostMapping("/Blog-Create")
    public ModelAndView create(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create","blog",new Blog());
        return modelAndView ;
    }
    @GetMapping("/Blog-Delete/{id}")
    public String delete(@PathVariable Long id){
        Blog blog = blogService.findById(id);

        blogService.remove(blog.getId());

        return "redirect:/";
    }
    @GetMapping("/Blog-content/{id}")
    public ModelAndView content(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/blog/content");
        modelAndView.addObject("blog", blog);
        return modelAndView ;
    }
    @PostMapping("/Blog-content")
    public ModelAndView content_1(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/content");
//        modelAndView.addObject("blog", blog);
        return modelAndView ;
    }

}
