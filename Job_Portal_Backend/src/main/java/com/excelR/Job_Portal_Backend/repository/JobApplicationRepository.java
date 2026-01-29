package com.excelR.Job_Portal_Backend.repository;

import com.excelR.Job_Portal_Backend.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

    List<JobApplication> findByUserId(long userId);
    List<JobApplication> findByJobId(long jobId);
}

