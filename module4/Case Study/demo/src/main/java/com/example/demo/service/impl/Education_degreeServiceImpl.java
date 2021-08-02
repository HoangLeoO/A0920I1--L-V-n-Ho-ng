package com.example.demo.service.impl;

import com.example.demo.model.Education_degree;
import com.example.demo.repository.Education_degreeRepository;
import com.example.demo.service.Education_degreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education_degreeServiceImpl implements Education_degreeService {
    @Autowired
    private Education_degreeRepository education_degreeRepository ;
    @Override
    public List<Education_degree> findAll() {
        return education_degreeRepository.findAll();
    }
}
