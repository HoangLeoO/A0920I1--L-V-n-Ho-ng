package com.example.bai3.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @NotNull(message = "Không được để trống")
    @Size(min=6 , max = 30 , message = "Ký tự lớn hơn 6 và nhỏ hơn 30")
    private String name ;

    @NotNull(message = "Không được để trống")
    private int age;

    @Email(message = "Nhập sai định dạng")
    private String email;

    @NotNull(message = "Không được để trống")
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account_fk;

    @NotNull(message = "không được để trống")
    @Size(min=3,max=30 ,message = "Yêu cầu kí tự lớn hơn 3 và nhỏ hơn 1")
    private String account;

    @Size(min=1,max=30,message = "yêu cầu nhập mật khẩu")
    private String password;
    public User() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getAccount_fk() {
        return account_fk;
    }

    public void setAccount_fk(Account account_fk) {
        this.account_fk = account_fk;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
