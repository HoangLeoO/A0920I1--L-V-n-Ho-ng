package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LibraryController {
    @RequestMapping("/")
    public String library(){
        return "/list";
    }
    @RequestMapping("/library")
    public String librarySearch(Model model , @RequestParam String search){
        Map<String,String> lib = new HashMap<>();
        lib.put("Hello","Xin Chao");
        lib.put("Thanks","Cam On");
        model.addAttribute("search",lib.get(search));
        return "/index";
    }
}
