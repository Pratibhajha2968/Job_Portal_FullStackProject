package com.excelR.Job_Portal_Backend.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelR.Job_Portal_Backend.model.User;

public interface UserRepository  extends JpaRepository<User , Long>{

//	    Optional<User> findByEmal(String email);
}
