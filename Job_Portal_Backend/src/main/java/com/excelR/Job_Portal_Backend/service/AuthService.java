package com.excelR.Job_Portal_Backend.service;

import com.excelR.Job_Portal_Backend.model.User;

public interface AuthService {

    User register(User user);

    User login(String email, String password);
}
