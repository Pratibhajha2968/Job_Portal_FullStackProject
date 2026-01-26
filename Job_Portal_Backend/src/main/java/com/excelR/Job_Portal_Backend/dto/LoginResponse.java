package com.excelR.Job_Portal_Backend.dto;

import lombok.Data;

@Data
public class LoginResponse {
	
	    private String token;
	    private String email;

	    public LoginResponse(String token, String email) {
	        this.token = token;
	        this.token = token;
	        this.email = email;
	    }

}
