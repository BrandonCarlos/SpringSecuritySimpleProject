package com.telusko.springSecEx.controller;

import com.telusko.springSecEx.model.Users;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return user;
    }
}
