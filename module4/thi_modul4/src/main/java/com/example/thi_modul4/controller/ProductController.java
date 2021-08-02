package com.example.thi_modul4.controller;

import com.example.thi_modul4.model.Product;
import com.example.thi_modul4.service.ProductService;
import com.example.thi_modul4.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService ;

    @Autowired
    private ProductTypeService productTypeService ;


    @GetMapping("/product_list")
    public ModelAndView getIndex(@PageableDefault(value = 5) Pageable pageable){
        Page<Product> products = productService.findAllProduct(pageable);
        ModelAndView modelAndView = new ModelAndView("/product/list","products",products);
        return modelAndView;
    }
    @GetMapping("/product_list_search")
    public ModelAndView getHome(@RequestParam Optional<String> key_search, @PageableDefault(value = 5) Pageable pageable, Model model){
        if(!key_search.isPresent()){
            return new ModelAndView("/product/list", "products", productService.findAllProduct(pageable));
        }else {
            model.addAttribute("key_search", key_search.get());
            return new ModelAndView("/product/list", "products", productService.findByName(key_search.get(),pageable));
        }
    }
    @GetMapping("/product_create")
    public String ShowFromCreate(Model model){
        model.addAttribute("product",new Product());
        model.addAttribute("productType",productTypeService.findAll());
        return "/product/create";
    }
    @PostMapping("/product_create")
    public String create(@Valid @ModelAttribute Product product, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("productType",productTypeService.findAll());
            return "/product/create";
        }else {
            productService.save(product);

            return "redirect:/product_list";
        }
    }
    @GetMapping("/{id}/product_delete")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("/product/delete");
        modelAndView.addObject("product", productService.findById(id));
        return modelAndView;
    }
    @PostMapping("/product_delete")
    public String delete(@ModelAttribute("product") Product product){
        System.out.println(product.getName());
        productService.deleteById(product.getId());
        return "redirect:/product_list";
    }

    @GetMapping("/{id}/product_edit")
    public ModelAndView showFromEdit(@PathVariable Long id){
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/product/edit");
        modelAndView.addObject("product" ,product);
        modelAndView.addObject("productType",productTypeService.findAll());
        return  modelAndView;
    }
    @PostMapping("/product_edit")
    public String edit(@ModelAttribute("product") Product product){
        productService.save(product);
        return  "redirect:/product_list";
    }
}
