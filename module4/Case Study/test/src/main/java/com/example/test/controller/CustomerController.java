package com.example.test.controller;

import com.example.test.model.Customer;
import com.example.test.service.CustomerService;
import com.example.test.service.CustomerTypeService;
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
public class CustomerController {
    @Autowired
    private CustomerService customerService ;

    @Autowired
    private CustomerTypeService customerTypeService ;

    @GetMapping("/customer_list")
    public ModelAndView getIndex(@PageableDefault(value = 5) Pageable pageable){
        Page<Customer> customerList = customerService.findAllCustomer(pageable);
        ModelAndView modelAndView = new ModelAndView("/customer/list","customers",customerList);
        return modelAndView;
    }

    @GetMapping("/customer_list_search")
    public ModelAndView getHome(@RequestParam Optional<String> key_search, @PageableDefault(value = 5) Pageable pageable, Model model){
        if(!key_search.isPresent()){
            return new ModelAndView("/customer/list", "customers", customerService.findAllCustomer(pageable));
        }else {
            model.addAttribute("key_search", key_search.get());
            return new ModelAndView("/customer/list", "customers", customerService.findByName(key_search.get(),pageable));
        }
    }
    @GetMapping("/customer_create")
    public String ShowFromCreate(Model model){
        model.addAttribute("customer",new Customer());
        model.addAttribute("customerType",customerTypeService.findAll());
        return "/customer/create";
    }
    @PostMapping("/customer_create")
    public String create(@Valid @ModelAttribute Customer customer, BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("customerType",customerTypeService.findAll());
            return "/customer/create";
        }else {
        customerService.save(customer);
        return "redirect:/customer_list";
        }
    }
    @GetMapping("/{id}/customer_delete")
    public ModelAndView showDeleteForm(@PathVariable Long id){
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customer", customerService.findById(id));
            return modelAndView;
    }
    @PostMapping("/customer_delete")
    public String delete(@ModelAttribute("customer") Customer customer){
        System.out.println(customer.getName());
        customerService.deleteById(customer.getId());
        return "redirect:/customer_list";
    }

    @GetMapping("/{id}/customer_edit")
    public ModelAndView showFromEdit(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer" ,customer);
        modelAndView.addObject("customerType",customer);
        return  modelAndView;
    }
    @PostMapping("/customer_edit")
    public String edit(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        return  "redirect:/customer_list";
    }
}
