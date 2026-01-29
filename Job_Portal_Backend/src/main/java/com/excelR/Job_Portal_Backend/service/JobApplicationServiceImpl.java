package com.excelR.Job_Portal_Backend.service;

import com.excelR.Job_Portal_Backend.model.ApplicationStatus;
import com.excelR.Job_Portal_Backend.model.JobApplication;
import com.excelR.Job_Portal_Backend.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JobApplicationServiceImpl {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    // ✅ Apply for job
    public JobApplication applyForJob(long jobId, long userId, String resumePath) {
    	
    	System.out.println("SAVING TO DB");

        JobApplication application = new JobApplication();
        application.setJobId(jobId);
        application.setUserId(userId);
        application.setResumePath(resumePath);
        application.setStatus(ApplicationStatus.APPLIED);

        return jobApplicationRepository.save(application);
    }

    // Get all applications by user
    public List<JobApplication> getApplicationsByUser(long userId) {
        return jobApplicationRepository.findByUserId(userId);
    }

    // Get all applications by job
    public List<JobApplication> getApplicationsByJob(long jobId) {
        return jobApplicationRepository.findByJobId(jobId);
    }

    // Update application status
    public JobApplication updateApplicationStatus(long applicationId, ApplicationStatus status) {
        Optional<JobApplication> optional = jobApplicationRepository.findById(applicationId);
        if (optional.isPresent()) {
            JobApplication application = optional.get();
            application.setStatus(status);
            return jobApplicationRepository.save(application);
        } else {
            throw new RuntimeException("Application not found with id: " + applicationId);
        }
    }

    // Get single application
    public JobApplication getApplicationById(long applicationId) {
        return jobApplicationRepository.findById(applicationId)
                .orElseThrow(() -> new RuntimeException("Application not found"));
    }
}
