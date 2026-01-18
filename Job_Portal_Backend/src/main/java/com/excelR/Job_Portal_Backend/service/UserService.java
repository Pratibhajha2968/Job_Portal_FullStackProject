package com.excelR.Job_Portal_Backend.service;

import java.util.List;
import com.excelR.Job_Portal_Backend.model.User;

public interface UserService {

    // Auth related
    User register(User user);
    User findByEmail(String email);

    // CRUD operations
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
