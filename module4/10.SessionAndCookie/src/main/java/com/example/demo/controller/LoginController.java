package com.example.demo.controller;

import com.example.demo.model.User;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class LoginController {
    /* them nguoi dung vao Model attribute */
    @ModelAttribute("user")
    public User setUpUserFrom(){
        return  new User();
    }

    @RequestMapping("/login")
    public  String Index(@CookieValue(value = "setUser",defaultValue = "")String  setUser, Model model){
        Cookie cookie = new Cookie("setUser",setUser);
        model.addAttribute("cookieValue",cookie);
        return "login/login";
    }
    @PostMapping("/dologin")
    public String dologin(@ModelAttribute("user") User user, Model model , @CookieValue(value = "setUser" ,defaultValue = "") String setUser, HttpServletResponse response
     , HttpServletRequest request){
        //trien khai logic nghiep vu
        if (user.getEmail().equals("admin@gmail.com") && user.getPasswork().equals("12345")) {
            // tạo cookie và thiết lập nó để phản hồi
            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);

            // lấy tất cả cookie
            Cookie[] cookies = request.getCookies();

            // lặp lại từng cookie

            for (Cookie ck : cookies) {
                // chỉ hiển thị cookie có tên 'setUser'
                if (ck.getName().equals("setUser")) {
                    model.addAttribute("cookieValue", ck);
                    break;
                } else {
                    ck.setValue("");
                    model.addAttribute("cookieValue", ck);
                    break;
                }
            }
            model.addAttribute("message","Login success. Welcome");

        }else {
            user.setEmail("");
            Cookie cookie = new Cookie("setUser",setUser);
            model.addAttribute("cookieValue",cookie);
            model.addAttribute("message","Login failed.Try again.");
        }
        return "login/login";
    }
}
