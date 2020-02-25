package com.example.cityeventservice.controller;

import com.example.cityeventservice.db.UserRepository;
import com.example.cityeventservice.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("api/users/")
public class UserController {

    private UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUser(){
        List <User> users = new ArrayList<>();
        this.userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }
}
