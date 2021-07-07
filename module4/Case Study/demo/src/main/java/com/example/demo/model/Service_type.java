package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_type")
public class Service_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceTypeId ;

    private String serviceTypeName ;

    @OneToMany(mappedBy = "serviceType")
    private List<Service> services ;

    public Service_type() {
    }

    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
