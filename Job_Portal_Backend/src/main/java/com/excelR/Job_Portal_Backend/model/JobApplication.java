package com.excelR.Job_Portal_Backend.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "jobapplications")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long userId;
    private long jobId;

    private String resumePath;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status = ApplicationStatus.APPLIED;

    @PrePersist
    public void setDefaultStatus() {
        if (status == null) {
            status = ApplicationStatus.APPLIED;
        }
    }
}
