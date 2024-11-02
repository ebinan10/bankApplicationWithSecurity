package com.security.security.controller;

import com.security.security.model.Users;
import com.security.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:8000")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.register(user);
    }
    }


