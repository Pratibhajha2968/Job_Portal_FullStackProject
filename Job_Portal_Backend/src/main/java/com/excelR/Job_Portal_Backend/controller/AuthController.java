package com.excelR.Job_Portal_Backend.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.excelR.Job_Portal_Backend.dto.LoginRequest;
import com.excelR.Job_Portal_Backend.dto.RegisterRequest;
import com.excelR.Job_Portal_Backend.model.User;
import com.excelR.Job_Portal_Backend.service.AuthService;
import com.excelR.Job_Portal_Backend.security.JwtUtil;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    private final AuthService authService;
    private final JwtUtil jwtUtil;

    public AuthController(AuthService authService, JwtUtil jwtUtil) {
        this.authService = authService;
        this.jwtUtil = jwtUtil;
    }

    // http://localhost:8080/api/auth/register
    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest request) {

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        
        return authService.register(user);
    }

    // http://localhost:8080/api/auth/login
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        User user = authService.login(request.getEmail(), request.getPassword());

        String token = jwtUtil.generateToken(user.getEmail());

        return ResponseEntity.ok(
            Map.of(
                "token", token,
                "email", user.getEmail()
                
            )
        );
    }
}

