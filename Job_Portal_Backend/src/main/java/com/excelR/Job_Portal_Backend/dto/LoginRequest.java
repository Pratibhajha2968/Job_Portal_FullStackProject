package com.excelR.Job_Portal_Backend.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
