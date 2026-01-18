package com.excelR.Job_Portal_Backend.controller;

import com.excelR.Job_Portal_Backend.model.JobApplication;
import com.excelR.Job_Portal_Backend.service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin(origins = "*")
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    // Apply for a job
//  http://localhost:8080/api/applications/apply?userId=1&jobId=2
    @PostMapping("/apply")
    public JobApplication apply(@RequestParam long userId, @RequestParam long jobId) {
        return jobApplicationService.applyForJob(userId, jobId);
    }

    // Get all applications by user
//  http://localhost:8080/api/applications/user/1
    @GetMapping("/user/{userId}")
    public List<JobApplication> getByUser(@PathVariable long userId) {
        return jobApplicationService.getApplicationsByUser(userId);
    }

    // Get all applications by job
//   http://localhost:8080/api/applications/job/2
    @GetMapping("/job/{jobId}")
    public List<JobApplication> getByJob(@PathVariable long jobId) {
        return jobApplicationService.getApplicationsByJob(jobId);
    }

    // Update application status
//  http://localhost:8080/api/applications/1/status?status=SELECTED
    @PutMapping("/{applicationId}/status")
    public JobApplication updateStatus(@PathVariable long applicationId, @RequestParam String status) {
        return jobApplicationService.updateApplicationStatus(applicationId, status);
    }
}
