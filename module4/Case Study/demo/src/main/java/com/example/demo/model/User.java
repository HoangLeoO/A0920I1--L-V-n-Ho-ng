package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String username ;

    private String password ;

    @OneToMany(mappedBy = "user")
    private List<User_Role> user_roles ;

    @OneToMany(mappedBy = "user")
    private List<Employee> employees;


    public User() {
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User_Role> getUser_roles() {
        return user_roles;
    }

    public void setUser_roles(List<User_Role> user_roles) {
        this.user_roles = user_roles;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
