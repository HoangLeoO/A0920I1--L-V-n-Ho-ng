package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping(value = "/converter" ,method = RequestMethod.GET)
    public String convert(){
        return "/index";
    }
    @RequestMapping(value = "/converter",method = RequestMethod.POST)
    public String converter(Model model , @RequestParam float vnd){
        model.addAttribute("VND",vnd);
        model.addAttribute("USD",vnd/22000);
        return "/converter";
    }
}
