package com.excelR.Job_Portal_Backend.controller;

import com.excelR.Job_Portal_Backend.model.JobApplication;
import com.excelR.Job_Portal_Backend.model.ApplicationStatus;
import com.excelR.Job_Portal_Backend.service.FileStorageService;
import com.excelR.Job_Portal_Backend.service.JobApplicationServiceImpl;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin(origins = "http://localhost:5174")
public class JobApplicationController {

    private final JobApplicationServiceImpl jobApplicationService;
    private final FileStorageService fileStorageService;

    public JobApplicationController(JobApplicationServiceImpl jobApplicationService,
                                    FileStorageService fileStorageService) {
        this.jobApplicationService = jobApplicationService;
        this.fileStorageService = fileStorageService;
    }

    // ✅ Apply for job
    @PostMapping("/apply")
    public JobApplication applyForJob(
            @RequestParam long jobId,
            @RequestParam long userId,
            @RequestParam MultipartFile resume
    ) throws IOException {
    	System.out.println("APPLY API HIT");
    	
    	System.out.println("jobId = " + jobId);
        System.out.println("userId = " + userId);
        System.out.println("file = " + resume.getOriginalFilename());

        // Save file to server
        String resumePath = fileStorageService.saveResume(resume);

        // Save application in DB
        return jobApplicationService.applyForJob(jobId, userId, resumePath);
    }

    // Get applications by user
    @GetMapping("/user/{userId}")
    public List<JobApplication> getApplicationsByUser(@PathVariable long userId) {
        return jobApplicationService.getApplicationsByUser(userId);
    }

    // Get applications by job
    @GetMapping("/job/{jobId}")
    public List<JobApplication> getApplicationsByJob(@PathVariable long jobId) {
        return jobApplicationService.getApplicationsByJob(jobId);
    }

    // Update application status
    @PutMapping("/{applicationId}/status")
    public JobApplication updateApplicationStatus(
            @PathVariable long applicationId,
            @RequestParam ApplicationStatus status
    ) {
        return jobApplicationService.updateApplicationStatus(applicationId, status);
    }

    // Download resume
    @GetMapping("/download/{applicationId}")
    public ResponseEntity<Resource> downloadResume(@PathVariable long applicationId) throws IOException {
        JobApplication application = jobApplicationService.getApplicationById(applicationId);
        Resource file = fileStorageService.loadResume(application.getResumePath());

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + application.getResumePath() + "\"")
                .body(file);
    }
}
