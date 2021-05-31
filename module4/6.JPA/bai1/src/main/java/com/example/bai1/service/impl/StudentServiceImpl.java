package com.example.bai1.service.impl;

import com.example.bai1.model.Student;
import com.example.bai1.repository.StudentRepository;
import com.example.bai1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository  ;


    @Override
    public Page<Student> findAllStudent(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Page<Student> findStudentByName(String name, Pageable pageable) {
        return studentRepository.findByName(name,pageable);
    }

}
