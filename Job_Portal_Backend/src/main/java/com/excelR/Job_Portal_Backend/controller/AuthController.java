package com.excelR.Job_Portal_Backend.controller;

import org.springframework.web.bind.annotation.*;

import com.excelR.Job_Portal_Backend.model.User;
import com.excelR.Job_Portal_Backend.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
//  http://localhost:8080/api/auth/register
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }
//  http://localhost:8080/api/auth/login
    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return authService.login(user.getEmail(), user.getPassword());
    }

}
