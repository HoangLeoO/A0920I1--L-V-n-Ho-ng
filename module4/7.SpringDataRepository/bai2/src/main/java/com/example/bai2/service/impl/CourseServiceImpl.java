package com.example.bai2.service.impl;

import com.example.bai2.model.Course;
import com.example.bai2.repository.CourseRepository;
import com.example.bai2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }
}
