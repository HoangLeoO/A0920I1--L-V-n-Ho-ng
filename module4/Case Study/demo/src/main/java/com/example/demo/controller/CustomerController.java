package com.example.demo.controller;


import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService ;

    @Autowired
    CustomerTypeService customerTypeService ;

    @GetMapping("/customer/list")
    public ModelAndView customerList(){
        List<Customer> customers = customerService.findAllCustomer();
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customer",customers);
        return modelAndView;
    }

    @GetMapping("/customer/create")
    public ModelAndView fromCreate(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        modelAndView.addObject("customerType",customerTypeService.findAllCustomerType());
        return modelAndView ;
    }

    @PostMapping("/customer/create")
    public String customerCreate (@Validated Customer customer, BindingResult bindingResult){
       if(bindingResult.hasErrors()){
           return "customer/create";
       }else {
           customerService.save(customer);
           return "redirect:/customer/list";
       }
    }
    @GetMapping("/customer/delete/{id}")
    public ModelAndView fromDelete (@PathVariable(value = "id") int id) {
        ModelAndView modelAndView = new ModelAndView("customer/delete","customer",customerService.findByIdCustomer(id));
        return modelAndView ;
    }

    @PostMapping("/customer/delete")
    public String Delete(@ModelAttribute("customer") Customer customer){
        customerService.remove(customer.getCustomerId());
        return "redirect:/customer/list";
    }
    @GetMapping("/customer/edit/{id}")
    public ModelAndView fromEdit(@PathVariable(value = "id") int id){
        ModelAndView modelAndView = new ModelAndView("customer/edit","customer",customerService.findByIdCustomer(id));
        return modelAndView ;
    }
    @PostMapping("/customer/edit")
    public String edit(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        return  "redirect:/customer/list";
    }
}
