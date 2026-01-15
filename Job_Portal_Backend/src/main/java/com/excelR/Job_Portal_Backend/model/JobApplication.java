package com.excelR.Job_Portal_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="")
public class JobApplication {
      
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	  private long userId;
	  private long jobId;
	  private String status;
//	  it will tell you about where you applied for the job , are you selected or rejected
}
