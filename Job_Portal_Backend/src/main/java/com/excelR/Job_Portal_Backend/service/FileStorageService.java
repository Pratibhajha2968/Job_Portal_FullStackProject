package com.excelR.Job_Portal_Backend.service;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileStorageService {

    private static final String UPLOAD_DIR = "uploads/resumes/";

    // Save resume and return filename
    public String saveResume(MultipartFile file) throws IOException {
        // Ensure directory exists
        Files.createDirectories(Paths.get(UPLOAD_DIR));

        // Generate unique filename
        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
        Path path = Paths.get(UPLOAD_DIR + fileName);

        // Save file bytes
        Files.write(path, file.getBytes());

        return fileName;
    }

    // Load resume for download
    public Resource loadResume(String fileName) throws IOException {
        Path path = Paths.get(UPLOAD_DIR + fileName);
        if (!Files.exists(path)) {
            throw new IOException("File not found: " + fileName);
        }

        Resource resource = new UrlResource(path.toUri());
        if (!resource.exists() || !resource.isReadable()) {
            throw new IOException("Could not read file: " + fileName);
        }

        return resource;
    }
}
