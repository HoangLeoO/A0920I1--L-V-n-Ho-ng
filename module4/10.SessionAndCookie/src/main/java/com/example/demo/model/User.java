package com.example.demo.model;

public class User {
    private String email ;
    private  String passwork;

    public User(String email, String passwork) {
        this.email = email;
        this.passwork = passwork;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }
}
