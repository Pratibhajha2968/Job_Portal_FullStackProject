package com.excelR.Job_Portal_Backend.service;

import com.excelR.Job_Portal_Backend.model.JobApplication;
import com.excelR.Job_Portal_Backend.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    @Override
    public JobApplication applyForJob(long userId, long jobId) {
        JobApplication application = new JobApplication();
        application.setUserId(userId);
        application.setJobId(jobId);
        application.setStatus("APPLIED"); // default status
        return jobApplicationRepository.save(application);
    }

    @Override
    public List<JobApplication> getApplicationsByUser(long userId) {
        return jobApplicationRepository.findByUserId(userId);
    }

    @Override
    public List<JobApplication> getApplicationsByJob(long jobId) {
        return jobApplicationRepository.findByJobId(jobId);
    }

    @Override
    public JobApplication updateApplicationStatus(long applicationId, String status) {
        Optional<JobApplication> optional = jobApplicationRepository.findById(applicationId);
        if (optional.isPresent()) {
            JobApplication application = optional.get();
            application.setStatus(status);
            return jobApplicationRepository.save(application);
        } else {
            throw new RuntimeException("Application not found with id: " + applicationId);
        }
    }
}
