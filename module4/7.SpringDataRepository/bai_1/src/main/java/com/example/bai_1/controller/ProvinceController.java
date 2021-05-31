package com.example.bai_1.controller;

import com.example.bai_1.model.Province;
import com.example.bai_1.service.ProvinceService;
import com.example.bai_1.service.impl.ProvinceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProvinceController {

    private ProvinceService provinceService = new ProvinceServiceImpl();

    @GetMapping("/provinces")
    public ModelAndView listProvinces(){
        Iterable<Province> provinces = provinceService.findAll();
        ModelAndView modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces", provinces);
        return modelAndView;
    }
}
