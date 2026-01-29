package com.excelR.Job_Portal_Backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Entity
@Table(name = "jobapplications")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobApplication implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "job_id", nullable = false)
    private long jobId;

    @Column(name = "user_id", nullable = false)
    private long userId;

    @Column(name = "resume_path", nullable = false)
    private String resumePath;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ApplicationStatus status;
}

