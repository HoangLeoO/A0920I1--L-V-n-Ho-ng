package com.example.bai3.controller;

import com.example.bai3.model.Account;
import com.example.bai3.model.User;
import com.example.bai3.service.UserService;
import com.example.bai3.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ModelAndView  welcomePage( ) {
        ModelAndView modelAndView = new ModelAndView("welcom");
        modelAndView.addObject("message","Hello!");
        return modelAndView ;
    }

    @GetMapping("/login")
    public String loginPage(Model model) {

        return "login";
    }
    @GetMapping("/logoutSuccessful")
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logout";
    }
    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo( ) {
        return "userInfoPage";
    }

    @GetMapping("/register")
    public ModelAndView  ShowFrom() {
        ModelAndView modelAndView = new ModelAndView("register","user",new User());
        return modelAndView;
    }
    @PostMapping("/register")
    public ModelAndView register(@Valid @ModelAttribute("user") User user , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("register");
            return  modelAndView;
        }else {
            Account account = new Account(user.getAccount(),user.getPassword());
            user.setAccount_fk(account);
            userService.save(user);
            ModelAndView modelAndView = new ModelAndView("register");
            modelAndView.addObject("user",new User());
            modelAndView.addObject("message","Dang Ky Thanh Cong !");

        return modelAndView;
        }

    }
}