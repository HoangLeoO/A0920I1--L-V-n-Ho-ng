package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String showCalculator(){
        return "/index";
    }

    @PostMapping("/calculator")
    public String result(Model model, @RequestParam String a, @RequestParam String b, @RequestParam(required = false) String operator){
        int soa = Integer.parseInt(a);
        int sob = Integer.parseInt(b);
        System.out.println(soa);
        System.out.println(sob);
        model.addAttribute("soa",soa);
        model.addAttribute("sob",sob);
        model.addAttribute("operator", operator);
        return "/result";
    }
}
