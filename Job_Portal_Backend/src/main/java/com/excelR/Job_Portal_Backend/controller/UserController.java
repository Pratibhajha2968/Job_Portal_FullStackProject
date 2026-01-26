package com.excelR.Job_Portal_Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.excelR.Job_Portal_Backend.dto.LoginRequest;
import com.excelR.Job_Portal_Backend.model.User;
import com.excelR.Job_Portal_Backend.service.UserService;
import com.excelR.Job_Portal_Backend.security.JwtUtil;


@RestController
@RequestMapping("/api/users")
//@CrossOrigin // allow frontend requests
public class UserController {
	
	

    @Autowired
    private UserService userService;
    
    @Autowired 
    private JwtUtil jwtUtil;

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
    
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        User user = userService.login(request.getEmail(), request.getPassword());

        if (user == null) {
            return ResponseEntity.status(401).body("Invalid email or password");
        }

        String token = jwtUtil.generateToken(user.getEmail());

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "Login successful");
        response.put("token", token);

        Map<String, Object> userData = new HashMap<>();
        userData.put("id", user.getId());
        userData.put("email", user.getEmail());
        userData.put("name", user.getName());

        response.put("user", userData);

        return ResponseEntity.ok(response);
    }

    
    
//  http://localhost:8080/api/profile/1
    @GetMapping("/profile")
    public ResponseEntity<?> getProfile(@RequestHeader(value = "Authorization", required = false) String token) {
        try {
            System.out.println("Received token: " + token);

            if (token == null || token.isEmpty()) {
                return ResponseEntity.status(401).body(Map.of("message", "Missing token"));
            }

            // Remove "Bearer " prefix
            token = token.replace("Bearer ", "");
            String email = jwtUtil.extractUsername(token);
            System.out.println("Email from token: " + email);

            User user = userService.findByEmail(email);

            if (user == null) {
                return ResponseEntity.status(404).body(Map.of("message", "User not found"));
            }

            // Return only the fields needed (exclude password)
            Map<String, Object> response = Map.of(
                "id", user.getId(),
                "name", user.getName(),
                "email", user.getEmail()
                
//                "skills", user.getSkills(),
//                "resume", user.getResume(),
//                "profilePic", user.getProfilePic()
            );

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("message", "Failed to fetch profile"));
        }
    }
 

}
