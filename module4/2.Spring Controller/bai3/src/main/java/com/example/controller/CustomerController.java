package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class CustomerController {

    private CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/home")
    public String listCustomer(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customer",customerList);
        return "/customer/views";
    }
    @GetMapping("/create")
    public String showCreate(){
        return "/customer/create";
    }
    @PostMapping("/create")
    public String addCustomer(Model model, @RequestParam String id , @RequestParam String name ,@RequestParam String address ,@RequestParam String age){
        Customer customer = new Customer(id,name,address,age);
        customerService.save(customer);
        return "redirect:/home";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id){
        customerService.delete(id);
        return "redirect:/home";
    }
}
