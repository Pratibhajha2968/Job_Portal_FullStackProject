package com.excelR.Job_Portal_Backend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.excelR.Job_Portal_Backend.model.User;

@Service
public class UserService {

    public User register(@RequestBody User user) {
        return user;
    }
}