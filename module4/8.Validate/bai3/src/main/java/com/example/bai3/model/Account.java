package com.example.bai3.model;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String account;

    private String password;

    @OneToOne(mappedBy = "account_fk")
    private User user;

    public Account() {
    }


    public Account(String account,String password) {
        this.account = account ;
        this.password = password ;
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
