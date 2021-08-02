package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private UserService userService ;

    @Autowired
    private EmployeeService employeeService ;

    @Autowired
    private DivisionService divisionService ;

    @Autowired
    private PositionService positionService ;

    @Autowired
    private Education_degreeService education_degreeService ;

    @GetMapping("/employee-list")
    public ModelAndView employees(){
        List<Employee> employees = employeeService.findAllEmployee();
        ModelAndView modelAndView = new ModelAndView("employee/index","employees",employees);
        return modelAndView ;
    }

    @GetMapping("/employee-create")
    public ModelAndView showFromCreate(){
        ModelAndView modelAndView = new ModelAndView("employee/create","employee",new Employee());
        modelAndView.addObject("division",divisionService.findAll());
        modelAndView.addObject("position",positionService.findAll());
        modelAndView.addObject("user",userService.findAll());
        modelAndView.addObject("educationDegree",education_degreeService.findAll());

        return modelAndView ;
    }

    @PostMapping("/employee-create")
    public String addEmployee(@Validated  Employee employee , BindingResult bindingResult ){
        if(bindingResult.hasErrors()){
            return "employee/create";
        }else {
            employeeService.save(employee);
            return  "redirect:/employee-list";
        }
    }
}
