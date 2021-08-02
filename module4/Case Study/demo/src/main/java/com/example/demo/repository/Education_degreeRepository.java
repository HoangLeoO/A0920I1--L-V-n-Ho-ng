package com.example.demo.repository;

import com.example.demo.model.Education_degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Education_degreeRepository extends JpaRepository<Education_degree,Integer> {
}
