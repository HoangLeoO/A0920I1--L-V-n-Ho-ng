package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_type")
public class Customer_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerTypeId ;

    private String customerTypeName ;

    @OneToMany(mappedBy = "customerType")
    private List<Customer> customers ;

    public Customer_Type() {
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
