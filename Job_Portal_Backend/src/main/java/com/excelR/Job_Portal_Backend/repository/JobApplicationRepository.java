package com.excelR.Job_Portal_Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.excelR.Job_Portal_Backend.model.JobApplication;

import java.util.List;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

    // Fetch all applications for a specific user
    List<JobApplication> findByUserId(Long userId);

    // Fetch all applications for a specific job
    List<JobApplication> findByJobId(Long jobId);
}
