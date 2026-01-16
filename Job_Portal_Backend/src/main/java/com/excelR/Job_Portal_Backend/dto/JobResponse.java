package com.excelR.Job_Portal_Backend.dto;


//Used when sending job details to frontend

//Hides unnecessary/internal fields
//Shows only what UI needs

public class JobResponse{
          
	
	     private long id;
	     private String title;
	     private String description;
	     private String location;
	     private String jobtype;
	     private String company;
}