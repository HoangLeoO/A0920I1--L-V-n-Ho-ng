package com.example.demo.model;

import javax.persistence.*;
import java.time.DateTimeException;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractId;

    private DateTimeException contractStartDate ;

    private DateTimeException contractEndDate ;

    private Double contractDeposit ;

    private Double contractTotalMoney ;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer ;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee ;

    @ManyToOne
    @JoinColumn(name = "serviceId")
    private Service service ;

    public Contract() {
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public DateTimeException getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(DateTimeException contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public DateTimeException getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(DateTimeException contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public Double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(Double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public Double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(Double contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
