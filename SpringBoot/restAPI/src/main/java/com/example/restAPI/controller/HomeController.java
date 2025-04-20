package com.example.restAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/"
    public String serverHomePage(){
        return "Welcome! TOMCAT SERVER PORT : 8080";
    }
    @GetMapping("/contact")
    public String contact(){
        return "dohithspd1409@gmail.com    +91 76048 19929";
    }
}
