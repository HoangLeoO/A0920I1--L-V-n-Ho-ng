package com.example.demo.controller;


import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class LoginController {

    @GetMapping("/login")
    public String login(@ModelAttribute("credential") EmbeddedLdapProperties.Credential credential) {
        return "index";
    }

}