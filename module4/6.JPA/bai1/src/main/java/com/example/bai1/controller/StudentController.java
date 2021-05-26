package com.example.bai1.controller;

import com.example.bai1.model.Student;
import com.example.bai1.service.StudentService;
import com.example.bai1.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService ;
    @GetMapping("/index")
    public ModelAndView getIndex(){
        List<Student> studentList = studentService.findAllStudent();
        ModelAndView modelAndView = new ModelAndView("/index","students",studentList);
        return modelAndView;
    }
    @GetMapping("/create")
    public String ShowFromCreate(Model model){
        model.addAttribute("student",new Student());
        return "/create";
    }
    @PostMapping("/create")
    public String create(Student student){
        studentService.saveStudent(student);
        return "redirect:/index";
    }
    @GetMapping("/{id}/delete")
    public String delete(Model model, @PathVariable Integer id){
        model.addAttribute("student",studentService.findStudentById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(Student student ){
        studentService.deleteStudentById(student.getId());
        return "redirect:/index";
    }
}
