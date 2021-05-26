package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    ProductService productService ;
    @GetMapping("/")
    public String getHome(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("product",productList);
        return "/product/index";
    }
}
