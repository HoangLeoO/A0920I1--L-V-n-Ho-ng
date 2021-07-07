package com.example.demo.service.impl;

import com.example.demo.model.Customer_Type;
import com.example.demo.repository.CustomerTypeRepository;
import com.example.demo.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @Override
    public List<Customer_Type> findAllCustomerType() {
        return customerTypeRepository.findAll();
    }
}
