package com.excelR.Job_Portal_Backend.dto;


//Used when user logs in

// Accepts only email & password
// Prevents exposing full User entity



public class LoginRequest{
	
	  private String email;
	  private String password;
}