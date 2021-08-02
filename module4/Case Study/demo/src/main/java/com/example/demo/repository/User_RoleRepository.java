package com.example.demo.repository;

import com.example.demo.model.User_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_RoleRepository extends JpaRepository<User_Role,Integer> {
}
