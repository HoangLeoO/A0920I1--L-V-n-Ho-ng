package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_type")
public class Customer_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_type_id ;

    private String customer_type_name ;

    @OneToMany(mappedBy = "customer_type")
    private List<Customer> customers ;

    public Customer_Type() {
    }

    public int getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(int customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public String getCustomer_type_name() {
        return customer_type_name;
    }

    public void setCustomer_type_name(String customer_type_name) {
        this.customer_type_name = customer_type_name;
    }

}
