package com.example.frontendConnection.repository;

import com.example.frontendConnection.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
