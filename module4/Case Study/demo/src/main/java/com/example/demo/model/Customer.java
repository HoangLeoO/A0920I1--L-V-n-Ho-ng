package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId ;

    @ManyToOne
    @JoinColumn(name = "customerTypeId" )
    private Customer_Type customerType ;

    @Pattern(regexp = "KH-\\d{4}")
    private String CustomerCode ;

    @NotBlank(message = "Not null")
    @Size(min = 2,max = 20)
    private String customerName ;

    @DateTimeFormat(pattern = "mm/dd/yyyy")
    private String customerBirthday ;

    @NotBlank
    private String customerGender;

    @Pattern(regexp = "^[0-9\\-\\+]{9,15}$")
    private String customerIdCard ;

    @Pattern(regexp = "^[0-9\\-\\+]{9,15}$")
    private String customerPhone ;

    @Email
    private String customerEmail ;

    @NotBlank
    private String customerAddress ;

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public Customer_Type getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Customer_Type customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
