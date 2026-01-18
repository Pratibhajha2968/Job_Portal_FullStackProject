package com.excelR.Job_Portal_Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.excelR.Job_Portal_Backend.model.User;
import com.excelR.Job_Portal_Backend.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin // allow frontend requests
public class UserController {

    @Autowired
    private UserService userService;

//   http://localhost:8080/api/users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

//  http://localhost:8080/api/users/1
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

//  http://localhost:8080/api/users
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

//    http://localhost:8080/api/users/1
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

//    http://localhost:8080/api/users/1
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
