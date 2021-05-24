package com.example.service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public void DeleteById(int id) {
        customerRepository.DeleteById(id);
    }

    @Override
    public void Save(Customer customer) {
        customerRepository.Save(customer);
    }
}
