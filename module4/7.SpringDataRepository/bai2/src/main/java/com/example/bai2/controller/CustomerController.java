package com.example.bai2.controller;

import com.example.bai2.model.Customer;
import com.example.bai2.service.CourseService;
import com.example.bai2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CourseService courseService ;


    @GetMapping("/home")
    public ModelAndView getHome(@PageableDefault(value = 5) Pageable pageable, @RequestParam("search")Optional<String> search, Model model){
//        Page<Customer> customers = customerService.findAll(pageable);
        Page<Customer> customers;
        if(search.isPresent()){
            model.addAttribute("search",search.get());
            customers = customerService.findByName(search.get(), pageable);
        } else {
            customers = customerService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/list","customer",customers);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showFromCreate(Model model){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer",new Customer());
        model.addAttribute("courses",courseService.findAll());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView addCustomer(@ModelAttribute("customer") Customer customer,Model model){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer",new Customer());
        model.addAttribute("courses",courseService.findAll());
        return modelAndView;
    }
}
