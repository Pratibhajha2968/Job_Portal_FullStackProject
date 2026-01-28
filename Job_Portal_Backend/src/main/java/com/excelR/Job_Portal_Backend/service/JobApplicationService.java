package com.excelR.Job_Portal_Backend.service;

import com.excelR.Job_Portal_Backend.model.ApplicationStatus;
import com.excelR.Job_Portal_Backend.model.JobApplication;
import com.excelR.Job_Portal_Backend.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepo;

    public JobApplicationService(JobApplicationRepository jobApplicationRepo) {
        this.jobApplicationRepo = jobApplicationRepo;
    }

    // 1️⃣ Apply for a job
    public JobApplication applyForJob(long jobId, String resumePath) {
        JobApplication app = new JobApplication();

        // TODO: replace with logged-in user ID in production
        long userId = 1; // for now hard-coded for testing

        app.setUserId(userId);
        app.setJobId(jobId);
        app.setResumePath(resumePath);
        app.setStatus(ApplicationStatus.APPLIED);

        return jobApplicationRepo.save(app);
    }

    // 2️⃣ Update application status
    public JobApplication updateApplicationStatus(Long applicationId, ApplicationStatus status) {
        JobApplication app = jobApplicationRepo.findById(applicationId)
                .orElseThrow(() -> new RuntimeException("Application not found"));

        app.setStatus(status);
        return jobApplicationRepo.save(app);
    }

    // 3️⃣ Get all applications for a user
    public List<JobApplication> getApplicationsByUser(Long userId) {
        return jobApplicationRepo.findByUserId(userId);
    }

    // 4️⃣ Get all applications for a job
    public List<JobApplication> getApplicationsByJob(Long jobId) {
        return jobApplicationRepo.findByJobId(jobId);
    }

    // 5️⃣ Get single application by ID (for download)
    public JobApplication getApplicationById(Long applicationId) {
        return jobApplicationRepo.findById(applicationId)
                .orElseThrow(() -> new RuntimeException("Application not found"));
    }
}
