package com.example.bai1.service;

import com.example.bai1.model.Student;

import java.util.List;

public interface StudentService {
    //List Student
    List<Student> findAllStudent();
    //List Student Id
    Student findStudentById(int id);
    void saveStudent(Student student);
    void deleteStudentById(int id);
    //Search
    List<Student> findStudentByName(String name);
}
