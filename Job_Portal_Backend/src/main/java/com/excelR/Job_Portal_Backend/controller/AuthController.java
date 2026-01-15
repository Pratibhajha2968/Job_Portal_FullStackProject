package com.excelR.Job_Portal_Backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelR.Job_Portal_Backend.model.User;
import com.excelR.Job_Portal_Backend.service.UserService;
@RestController
@RequestMapping("/api/auth")
	
public class AuthController {
	 private final UserService userService;

	    public AuthController(UserService userService) {
	        this.userService = userService;
	    }

 //     http://localhost:8080/api/auth/register
	    @PostMapping("/register")
	    public User register(@RequestBody User user) {
	        return userService.register(user);
	    }
//	     http://localhost:8080/api/auth/login
	    @PostMapping("/login")
	    public String login(@RequestBody User user) {
	        return "Login API will be implemented later";
	    }
}
