package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rent_type")
public class Rent_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rent_type_id ;

    private String rent_type_name ;

    private Double rent_type_cost ;

    @OneToMany(mappedBy = "rent_type")
    private List<Service> services ;

    public Rent_type() {
    }

    public int getRent_type_id() {
        return rent_type_id;
    }

    public void setRent_type_id(int rent_type_id) {
        this.rent_type_id = rent_type_id;
    }

    public String getRent_type_name() {
        return rent_type_name;
    }

    public void setRent_type_name(String rent_type_name) {
        this.rent_type_name = rent_type_name;
    }

    public Double getRent_type_cost() {
        return rent_type_cost;
    }

    public void setRent_type_cost(Double rent_type_cost) {
        this.rent_type_cost = rent_type_cost;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
