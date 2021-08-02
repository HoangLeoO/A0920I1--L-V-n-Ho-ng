package com.example.demo1.repository;

import com.example.demo1.model.Role;
import org.springframework.data.repository.CrudRepository;



public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByName(String name);
}
