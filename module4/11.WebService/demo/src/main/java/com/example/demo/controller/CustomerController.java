package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
     CustomerService customerService;

    // List customer
    @GetMapping("/")
    public  ResponseEntity<List<Customer>> getListCustomer(){
        List<Customer>  customers = customerService.findByAll();
        if(customers.isEmpty()){
            return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
        }
    }

    // Get customer by id
    @GetMapping(value = "/customers/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<Customer> getCustomer(@PathVariable ("id") Long id){
        System.out.println("Fetching Customer with id " + id);
        Customer customer = customerService.findById(id);
        if(customer==null){
            System.out.println("Customer with id " + id + " not found");
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
        }
    }

    // Add New Customer
    @PostMapping("/customers")
    public  ResponseEntity<Void> createCustomer(@RequestBody Customer customer , UriComponentsBuilder ucBuilder){
        System.out.println("Creating Customer " + customer.getName());
        customerService.save(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/customers/{id}").buildAndExpand(customer.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    // Update customer
    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id,@RequestBody Customer customer){
        System.out.println("Updating Customer " + id);
         Customer currentCustomer = customerService.findById(id);

         if(currentCustomer == null){
             System.out.println("Customer with id " + id + " not found");
             return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
         }
         currentCustomer.setName(customer.getName());
         currentCustomer.setEmail(customer.getEmail());
         currentCustomer.setPhone(customer.getPhone());
         currentCustomer.setAddress(customer.getAddress());

         customerService.save(currentCustomer);
         return  new ResponseEntity<Customer>(currentCustomer,HttpStatus.OK);
    }

    //delete customer
    @DeleteMapping(value = "/customers/{id}")
    public  ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Long id){
        System.out.println("Fetching & Deleting Customer with id" + id);
        Customer customer = customerService.findById(id);

        if (customer == null){
            System.out.println("Unable to delete . Customer with id" + id + "not found");
            return  new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        customerService.remove(id);
        return  new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
    }
}
