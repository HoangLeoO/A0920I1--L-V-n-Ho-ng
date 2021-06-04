package com.example.bai1.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty(message = "không được để trống")
    @Size(message ="Tên phải lớn hơn 2 chữ và nhỏ hơn 30",min = 2, max = 30)
    private String name;

    @Min(value = 18 ,message = "Giá trị nhở nhất là 18")
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
