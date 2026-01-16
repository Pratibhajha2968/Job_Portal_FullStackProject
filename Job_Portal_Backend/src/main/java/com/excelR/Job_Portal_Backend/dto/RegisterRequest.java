package com.excelR.Job_Portal_Backend.dto;


// sign up page for  new candidates
// Used when new user registers

// Accepts only required signup fields
// No ID, no internal fields
public class RegisterRequest {
    
	
	   private String name;
	   private String email;
	   private String password;
	   private String role;
}
