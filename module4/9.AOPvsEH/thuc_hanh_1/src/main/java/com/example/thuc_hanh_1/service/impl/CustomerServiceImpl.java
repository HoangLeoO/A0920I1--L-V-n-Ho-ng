package com.example.thuc_hanh_1.service.impl;

import com.example.thuc_hanh_1.exception.DuplicateEmailException;
import com.example.thuc_hanh_1.model.Customer;
import com.example.thuc_hanh_1.repository.CustomerRepository;
import com.example.thuc_hanh_1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository ;

    @Override
    public Page<Customer> findAll(Pageable pageable)   {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Page<Customer> findByName(String name, Pageable pageable) throws Exception {
        Page<Customer> customer = customerRepository.findByName(name,pageable);
        if (customer == null) {
            throw new Exception("customer not found!");
        }
        return customer ;
    }

    @Override
    public Customer findById(Long id) {
        return  customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) throws DuplicateEmailException  {
        try {
            customerRepository.save(customer);
        } catch (DataIntegrityViolationException e) {
            throw new DuplicateEmailException();
        }
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

}
