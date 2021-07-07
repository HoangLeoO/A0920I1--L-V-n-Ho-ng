package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.CustomerTypeRepository;
import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerTypeService;
import com.example.demo.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerRepository customerService ;

    @Autowired
    CustomerTypeService customerTypeService ;

    @GetMapping("/customer-list")
    public ModelAndView customerList(){
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customer",customers);
        return modelAndView;
    }

    @GetMapping("/customer-create")
    public ModelAndView fromCreate(Model model){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        model.addAttribute("customerType",customerTypeService.findAllCustomerType());
        return modelAndView ;
    }

    @PostMapping("/customer-create")
    public String customerCreate ( @ModelAttribute("customer") Customer customer){
        System.out.println(customer);
        customerService.save(customer);
        return "redirect:/customer-list";

    }
}
