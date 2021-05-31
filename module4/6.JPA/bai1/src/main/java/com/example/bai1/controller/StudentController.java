package com.example.bai1.controller;

import com.example.bai1.model.Student;
import com.example.bai1.service.StudentService;
import com.example.bai1.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService ;
    @GetMapping("/index")
    public ModelAndView getIndex(@PageableDefault(value = 5) Pageable pageable){
        Page<Student> studentList = studentService.findAllStudent(pageable);
        ModelAndView modelAndView = new ModelAndView("/index","students",studentList);
        return modelAndView;
    }
    @GetMapping("/search")
    public ModelAndView getHome(@RequestParam Optional<String> key_search, @PageableDefault(value = 5) Pageable pageable, Model model){
        if(!key_search.isPresent()){
            return new ModelAndView("/index", "students", studentService.findAllStudent(pageable));
        }else {
            model.addAttribute("key_search", key_search.get());
            return new ModelAndView("/index", "students", studentService.findStudentByName(key_search.get(),pageable));
        }
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
    public ModelAndView showDeleteForm(@PathVariable Integer id){
         Student student = studentService.findStudentById(id);
        if(student != null) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("student", student);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute("student") Student student){
        studentService.deleteStudentById(student.getId());
        return "redirect:/index";
    }
    @GetMapping("/{id}/edit")
    public ModelAndView showFromEdit(@PathVariable Integer id){
        Student student = studentService.findStudentById(id);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("student" ,student);
        return  modelAndView;
    }
    @PostMapping("/edit")
    public ModelAndView edit(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("student" ,student);
        return  modelAndView;
    }
}
