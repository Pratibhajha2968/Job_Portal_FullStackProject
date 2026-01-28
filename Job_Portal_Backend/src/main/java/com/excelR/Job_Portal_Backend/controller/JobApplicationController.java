package com.excelR.Job_Portal_Backend.controller;

import com.excelR.Job_Portal_Backend.model.ApplicationStatus;
import com.excelR.Job_Portal_Backend.model.JobApplication;
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
@CrossOrigin(origins = "*")
public class JobApplicationController {

    private final JobApplicationServiceImpl jobApplicationService;
    private final FileStorageService fileStorageService;

    public JobApplicationController(JobApplicationServiceImpl jobApplicationService,
                                    FileStorageService fileStorageService) {
        this.jobApplicationService = jobApplicationService;
        this.fileStorageService = fileStorageService;
    }

    // 1️⃣ Apply for a job with resume upload
    @PostMapping("/apply")
    public JobApplication applyForJob(
            @RequestParam long jobId,
            @RequestParam MultipartFile resume
    ) throws IOException {

        // Save the resume
        String resumePath = fileStorageService.saveResume(resume);

        // Apply for the job
        JobApplication application = jobApplicationService.applyForJob(jobId, resumePath);

        return application;
    }

    // 2️⃣ Get all applications by user
    @GetMapping("/user/{userId}")
    public List<JobApplication> getApplicationsByUser(@PathVariable long userId) {
        return jobApplicationService.getApplicationsByUser(userId);
    }

    // 3️⃣ Get all applications by job
    @GetMapping("/job/{jobId}")
    public List<JobApplication> getApplicationsByJob(@PathVariable long jobId) {
        return jobApplicationService.getApplicationsByJob(jobId);
    }

    // 4️⃣ Update application status (Admin only)
    @PutMapping("/{applicationId}/status")
    public JobApplication updateApplicationStatus(
            @PathVariable long applicationId,
            @RequestParam ApplicationStatus status
    ) {
        return jobApplicationService.updateApplicationStatus(applicationId, status);
    }

    // 5️⃣ Download resume (Admin only)
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
