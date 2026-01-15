package com.excelR.Job_Portal_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;


@Entity
@Data
@Table(name="user")
public class User{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

//	In this the job seeker , the admin of the page and the recruiters information are there
//	@Entity = first hibernate checks for entity and it says spring that this class should be stored in database
	
	private long id;
	private String name;
	private String email;
	private String password;
	private String role;
	
	


}
