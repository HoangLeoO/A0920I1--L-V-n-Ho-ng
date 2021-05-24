package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @RequestMapping( "/greeting" )
    public String getGreetingPage(Model model){
        model.addAttribute("text","hello cac ban");
        return "view";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkLogin(Model model, @RequestParam String username){
        model.addAttribute("username", username);
        return "result";
    }
}
