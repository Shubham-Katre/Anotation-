package com.example.test164.controller;

import com.example.test164.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    User s1;
@GetMapping("/user")
    public User getUser(){
        return s1;
    }

}
