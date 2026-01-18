package com.excelR.Job_Portal_Backend.service;

import com.excelR.Job_Portal_Backend.model.JobApplication;

import java.util.List;

public interface JobApplicationService {

    // Apply for a job
    JobApplication applyForJob(long userId, long jobId);

    // Get all applications by user
    List<JobApplication> getApplicationsByUser(long userId);

    // Get all applications by job
    List<JobApplication> getApplicationsByJob(long jobId);

    // Update application status
    JobApplication updateApplicationStatus(long applicationId, String status);
}
