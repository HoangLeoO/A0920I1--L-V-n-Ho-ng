package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rent_type")
public class Rent_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentTypeId ;

    private String rentTypeName ;

    private Double rentTypeCost ;

    @OneToMany(mappedBy = "rentType")
    private List<Service> services ;

    public Rent_type() {
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public Double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(Double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
