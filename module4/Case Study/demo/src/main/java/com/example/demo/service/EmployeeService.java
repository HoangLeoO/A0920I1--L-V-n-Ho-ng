package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();

    Employee findByIdEmployee(int id);
    
    void save(Employee employee);

    void remove(int id);
}
