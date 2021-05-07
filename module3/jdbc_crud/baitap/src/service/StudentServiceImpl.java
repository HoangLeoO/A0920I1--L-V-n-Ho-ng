package service;

import dao.IStudentDAO;
import dao.impl.StudentDAOImpl;
import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService{
    private static Map<String ,Student> studentMap ;
    private IStudentDAO studentDAO = new StudentDAOImpl();
    public StudentServiceImpl(){
        if(studentMap != null){
            return;
        }
        studentMap = new HashMap<>();
        studentMap.put("1", new Student("1","Hoang",20,"Da Nang"));
        studentMap.put("2", new Student("2","Thien",20,"Da Nang"));
        studentMap.put("3", new Student("3","Viet",20,"Da Nang"));
        studentMap.put("4", new Student("4","Tien",20,"Da Nang"));
    }
    @Override
    public Student getStudentById(String id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> getAll() {
        return  studentDAO.getAllStudent();
    }

    @Override
    public void saveStudent(Student student) {
//        studentMap.put(student.getId(),student);
        studentDAO.insertStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        if (studentMap.get(student.getId()) != null) {
            studentMap.put(student.getId(), student);
        }
    }

    @Override
    public void deleteStudentById(String id) {
        if (studentMap.get(id) != null) {
            studentMap.remove(id);
        }
    }
}
