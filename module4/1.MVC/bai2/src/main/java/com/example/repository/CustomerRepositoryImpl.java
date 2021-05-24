package com.example.repository;

import com.example.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static Map<Integer, Customer> listCustomer;

    static {
        listCustomer = new HashMap<>();
        listCustomer.put(1, new Customer(1, "Cong Tu", 26));
        listCustomer.put(2, new Customer(2, "Viet Tan", 23));
        listCustomer.put(3, new Customer(3, "Tan Viet", 24));
        listCustomer.put(4, new Customer(4, "Huu Long", 24));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(listCustomer.values());
    }

    @Override
    public Customer findById(int id) {
        return listCustomer.get(id);
    }

    @Override
    public void DeleteById(int id) {
        listCustomer.remove(id);
    }

    @Override
    public void Save(Customer customer) {
        listCustomer.put(customer.getId(),customer);
    }
}
