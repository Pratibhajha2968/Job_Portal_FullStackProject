package com.excelR.Job_Portal_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="job")
public class Job {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	    private Long id;          
	    private String title;     
	    private String description; 
	    private String salary;
	    private String location;
	    
	    
	   
	}

