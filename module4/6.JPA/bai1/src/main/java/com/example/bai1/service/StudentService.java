package com.example.bai1.service;

import com.example.bai1.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    //List Student
    Page<Student> findAllStudent(Pageable pageable);
    //List Student Id
    Student findStudentById(int id);
    void saveStudent(Student student);
    void deleteStudentById(int id);
    //Search
    Page<Student> findStudentByName(String name,Pageable pageable);

}
