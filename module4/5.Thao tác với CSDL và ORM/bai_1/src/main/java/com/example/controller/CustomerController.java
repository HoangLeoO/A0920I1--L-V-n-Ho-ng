package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.impl.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/index")
    public String index(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers",customerList);
        return "/customer/index";
    }
}
