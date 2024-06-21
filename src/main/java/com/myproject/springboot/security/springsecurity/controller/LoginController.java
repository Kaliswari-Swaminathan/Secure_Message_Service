package com.myproject.springboot.security.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showLoginPage")
    public  String showMyLoginPage(){
        return "fancy-login";
    }

    @GetMapping("/accessDenied")
    public  String showMyExceptionHandler(){
        return "access-denied";
    }
}
