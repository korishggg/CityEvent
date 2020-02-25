package com.example.cityeventservice.controller;

import com.example.cityeventservice.entity.User;
import com.example.cityeventservice.payload.ApiResponse;
import com.example.cityeventservice.service.interfaces.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("api/users/")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> listUsers(){
        List <User> users = new ArrayList<>();
        this.userService.getAll().forEach(user -> users.add(user));
        return users;
    }

    @PutMapping
    public User updateUser(User user){
        return this.userService.update(user);
    }

    @GetMapping
    @RequestMapping
    public User getUser(@PathVariable Long id){
        return this.userService.getById(id).orElseThrow( () -> new RuntimeException());
    }


}
