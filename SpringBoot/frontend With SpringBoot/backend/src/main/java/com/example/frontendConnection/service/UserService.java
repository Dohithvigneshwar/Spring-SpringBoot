package com.example.frontendConnection.service;

import com.example.frontendConnection.model.User;
import com.example.frontendConnection.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public String addUser(User user) {
        userRepo.save(user);
        return "Added";
    }
    public User getById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    public String updateById(User user) {
        userRepo.save(user);
        return "Updated";
    }

    public String deleteAll() {
        userRepo.deleteAll();
        return "all row deleted";
    }

    public String deleteById(int id) {
        userRepo.deleteById(id);
        return "deleted";
    }
}
