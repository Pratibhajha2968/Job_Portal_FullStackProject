package com.excelR.Job_Portal_Backend.repository;

import com.excelR.Job_Portal_Backend.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // No extra methods needed for basic CRUD
}
