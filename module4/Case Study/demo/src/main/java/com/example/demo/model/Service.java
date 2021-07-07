package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId ;

    private String serviceName ;

    private String serviceArea ;

    private String serviceCost ;

    private String serviceMaxPeople ;

    private String standardRoom ;

    private String descriptionOtherConvenience ;

    private Double poolArea ;

    private int numberOrFloors;

    @OneToMany(mappedBy = "service")
    private List<Contract> contracts ;

    @ManyToOne
    @JoinColumn(name = "rentTypeId")
    private Rent_type rentType ;

    @ManyToOne
    @JoinColumn(name = "serviceTypeId")
    private Service_type serviceType ;

    public Service() {
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(String serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(String serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOrFloors() {
        return numberOrFloors;
    }

    public void setNumberOrFloors(int numberOrFloors) {
        this.numberOrFloors = numberOrFloors;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public Rent_type getRentType() {
        return rentType;
    }

    public void setRentType(Rent_type rentType) {
        this.rentType = rentType;
    }

    public Service_type getServiceType() {
        return serviceType;
    }

    public void setServiceType(Service_type serviceType) {
        this.serviceType = serviceType;
    }
}
