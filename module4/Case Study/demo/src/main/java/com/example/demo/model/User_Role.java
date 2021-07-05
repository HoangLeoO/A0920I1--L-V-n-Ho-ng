package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class User_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_role_id ;

    private int role_id ;

    private String username ;


    @ManyToOne
    @JoinColumn(name = "role_id",insertable = false,updatable = false)
    private Role role ;

    @ManyToOne
    @JoinColumn(name = "username",insertable = false,updatable = false)
    private User user ;

    public User_Role() {
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
