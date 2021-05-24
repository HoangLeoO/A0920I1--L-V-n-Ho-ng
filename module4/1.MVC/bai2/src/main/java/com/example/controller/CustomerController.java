package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/customer")
    public String listCustomer(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers",customerList);
        return "/customer/list";
    }
    @GetMapping("/create")
    public String create(){
        return "/customer/create";
    }
    @PostMapping("/create")
    public String saveCreate(@RequestParam int id,@RequestParam String name , @RequestParam int age){
        Customer customer = new Customer(id,name,age);
        customerService.Save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent( @PathVariable int id){
        customerService.DeleteById(id);
        return "redirect:/customer";
    }
}
