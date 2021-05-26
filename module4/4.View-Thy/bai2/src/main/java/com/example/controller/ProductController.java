package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import com.example.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/index")
    public String getHome(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("product",productList);
        return "/product/index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "/product/create";
    }
    @PostMapping("/save")
    public  String  save(Product product){
        product.setId((int)(Math.random()*1000));
        productService.save(product);
        return "redirect:/index";
    }
    @GetMapping("/{id}/edit")
    public  String edit(@PathVariable int id ,Model model){
        model.addAttribute("products",productService.findById(id));
        return "/product/edit";
    }
    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/index";
    }
    @GetMapping("/{id}/delete")
    public  String delete(@PathVariable int id , Model model){
        model.addAttribute("products",productService.findById(id));
        return "/product/delete";
    }
    @PostMapping("/delete")
    public  String delete(Product product, RedirectAttributes redirect){
        productService.remove(product.getId());
        redirect.addFlashAttribute("success","Removed product  successfully !");
        return "redirect:/index";
    }
    @GetMapping("/{id}/view")
    public  String view(@PathVariable int id , Model model){
        model.addAttribute("products",productService.findById(id));
        return "/product/view";
    }
}
