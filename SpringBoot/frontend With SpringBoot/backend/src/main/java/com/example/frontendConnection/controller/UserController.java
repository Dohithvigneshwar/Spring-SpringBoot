package com.example.frontendConnection.controller;

import com.example.frontendConnection.model.User;
import com.example.frontendConnection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getusers")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("/adduser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getbyid/{id}")
    public User getUserById(@PathVariable int id){
        User res = userService.getById(id);
        return res;
    }

    @PutMapping("/updateuser")
    public String updateById(@RequestBody User user){
        return userService.updateById(user);
    }
    @DeleteMapping("/deleteall")
    public String deleteAll(){
        return userService.deleteAll();
    }
    @DeleteMapping("/deletebyid/{id}")
    public String deleteById(@PathVariable int id){
        if(getUserById(id) == null) return "No record found";
        return userService.deleteById(id);
    }
}
