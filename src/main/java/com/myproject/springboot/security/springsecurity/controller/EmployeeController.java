package com.myproject.springboot.security.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/leaders")
    public String showLeader(){
        return "leaders-info";
    }
    @GetMapping("/systems")
    public String showSystem(){
        return "systems-info";
    }
}
