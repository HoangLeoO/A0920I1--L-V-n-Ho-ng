package com.example.service;

import com.example.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements  CustomerService {
    public static Map<String,Customer> list = new HashMap<>();
    static {
        list.put("1",new Customer("1","Hoang","Da Nang","20"));
        list.put("2",new Customer("2","Phuong","Phu Yen","24"));
        list.put("3",new Customer("3","Giang","Da Nang","20"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public Customer findById(String id) {
        return list.get(id);
    }

    @Override
    public void delete(String id) {
        list.remove(id);
    }

    @Override
    public void save(Customer customer) {
        list.put(customer.getId(),customer);
    }
}
