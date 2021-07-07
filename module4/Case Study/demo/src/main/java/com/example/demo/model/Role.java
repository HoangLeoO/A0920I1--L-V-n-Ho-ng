package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId ;

    private String roleName ;

    @OneToMany(mappedBy = "role")
    private List<User_Role> userRoles;

    public Role() {
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User_Role> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<User_Role> userRoles) {
        this.userRoles = userRoles;
    }
}
