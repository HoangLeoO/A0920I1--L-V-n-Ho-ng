package com.example.test.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long id ;

    @NotBlank(message = "Name must not be Blank")
    @Column(name = "customer_name")
    @Size(min = 2 ,max = 50 ,message = "Size from 2 to 50")
    private String name ;

    @NotBlank(message = "Gender must not be Blank")
    @Column(name = "customer_gender")
    private String gender ;

    @DateTimeFormat(pattern = "mm/dd/yyyy")
    @Column(name ="customer_birthday" )
    private String birthday ;

    @Pattern(regexp = "^[0-9\\-\\+]{9,15}$" ,message = "ID card must have nine digits")
    @Column(name = "customer_id_card")
    private String idCard ;

    @Email(message = "Email must be in the format abc@xyz.com")
    @Column(name = "customer_email")
    private String email ;

    @Pattern(regexp = "^[0-9\\-\\+]{9,15}$" ,message = "Phone number must have 9 digits")
    @Column(name ="customer_phone" )
    private String phone ;

    @NotBlank(message = "Address must not be blank")
    @Column(name = "customer_address")
    private String address ;

    @ManyToOne
    @JoinColumn(name = "customerTypeId")
    private CustomerType customerType ;


    public Customer() {
    }

    public Customer(Long id ,String name ,String gender,String birthday  , String idCard ,String email ,String phone ,String address ,CustomerType customerType){
        this.id = id ;
        this.name = name ;
        this.gender = gender;
        this.birthday =birthday;
        this.idCard = idCard;
        this.email = email ;
        this.phone = phone;
        this.address = address ;
        this.customerType = customerType ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
