package com.example.restAPI.controller;

import com.example.restAPI.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @Autowired
    User user;
    @GetMapping("/login")
    public String logIn(){
       return ("Login Success");
    }
    @GetMapping("/get user")
    public String getUser(){
        return user.getUserName();
    }
}
