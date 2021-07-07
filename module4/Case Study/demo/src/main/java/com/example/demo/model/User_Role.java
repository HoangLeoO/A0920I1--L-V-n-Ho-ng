package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class User_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userRoleId ;

    private int roleId ;

    private String username ;


    @ManyToOne
    @JoinColumn(name = "roleId",insertable = false,updatable = false)
    private Role role ;

    @ManyToOne
    @JoinColumn(name = "username",insertable = false,updatable = false)
    private User user ;

    public User_Role() {
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
