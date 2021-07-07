package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "attach_service")
public class Attach_Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attachServiceId ;

    private String attachServiceName ;

    private Double attachServiceCost ;

    private int attachServiceUnit;

    private String attach_service_status ;

    @OneToMany(mappedBy = "attachService")
    private List<Contract_Detail> contractDetails ;

    public Attach_Service() {
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public Double getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(Double attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public int getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(int attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }

    public String getAttach_service_status() {
        return attach_service_status;
    }

    public void setAttach_service_status(String attach_service_status) {
        this.attach_service_status = attach_service_status;
    }

    public List<Contract_Detail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<Contract_Detail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
