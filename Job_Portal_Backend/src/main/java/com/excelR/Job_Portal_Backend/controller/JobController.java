package com.excelR.Job_Portal_Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.excelR.Job_Portal_Backend.model.Job;
import com.excelR.Job_Portal_Backend.service.JobService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/job")
@CrossOrigin(origins = "*")
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // Test endpoint
    // GET http://localhost:8080/job/test
    @GetMapping("/test")
    public String testJob() {
        return "JobController is working!";
    }

    // Save a job
    // POST http://localhost:8080/job/save
    @PostMapping("/save")
    public Job saveJob(@RequestBody Job job) {
        return jobService.saveJob(job);
    }

    // Fetch all jobs
    // GET http://localhost:8080/job/fetchAll
    @GetMapping("/fetchAll")
    public List<Job> fetchAllJobs() {
        return jobService.getAllJobs();
    }

    // Fetch a job by ID
    // GET http://localhost:8080/job/fetchByID/1
    @GetMapping("/fetchByID/{id}")
    public Job fetchJobById(@PathVariable Long id) {
        Optional<Job> job = jobService.getJobById(id);
        return job.orElse(null); // or throw RuntimeException if preferred
    }

    // Update a job
    // PUT http://localhost:8080/job/update/1
    @PutMapping("/update/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody Job job) {
        return jobService.updateJob(id, job);
    }

    // Delete a job
    // DELETE http://localhost:8080/job/delete/1
    @DeleteMapping("/delete/{id}")
    public String deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
        return "Job deleted successfully";
    }
}
