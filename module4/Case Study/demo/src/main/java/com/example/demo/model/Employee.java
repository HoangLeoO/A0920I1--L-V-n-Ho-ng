package com.example.demo.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId ;

    @NotEmpty
    @Size(min = 2,max = 20)
    private String  employeeName ;


    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String employeeBirthday;

    @Pattern(regexp = "NV-\\d{4}")
    private String employeeCode ;

    @Pattern(regexp = "^[0-9\\-\\+]{9,15}$")
    private String employeeIdCard ;

    @NotBlank
    private String employeeSalary ;

    @Pattern(regexp = "^[0-9\\-\\+]{9,15}$")
    private String employeePhone ;

    @Email
    private  String employeeEmail ;

    @NotNull
    private  String employeeAddress ;

    @ManyToOne
    @JoinColumn(name = "positionId")
    private Position position ;

    @ManyToOne
    @JoinColumn(name = "educationDegreeId")
    private Education_degree educationDegree;

    @ManyToOne
    @JoinColumn(name = "userId" ,insertable = false,updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "divisionId")
    private Division division ;


    public Employee() {
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Education_degree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(Education_degree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

}
