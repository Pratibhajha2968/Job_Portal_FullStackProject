package com.excelR.Job_Portal_Backend.service;

import com.excelR.Job_Portal_Backend.model.Job;
import com.excelR.Job_Portal_Backend.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // Save a new job
    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    // Get all jobs
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // Get job by ID
    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    // Delete job by ID
    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }

    // Update job
    public Job updateJob(Long id, Job updatedJob) {
        return jobRepository.findById(id)
                .map(job -> {
                    job.setTitle(updatedJob.getTitle());
                    job.setDescription(updatedJob.getDescription());
                    job.setLocation(updatedJob.getLocation());
                    return jobRepository.save(job);
                })
                .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
    }
}
