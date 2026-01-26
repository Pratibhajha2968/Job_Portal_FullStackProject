package com.excelR.Job_Portal_Backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.excelR.Job_Portal_Backend.model.User;
import com.excelR.Job_Portal_Backend.repository.UserRepository;
import com.excelR.Job_Portal_Backend.security.JwtUtil;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ---------- AUTH ----------
    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // ---------- CRUD ----------
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User existing = userRepository.findById(id).orElse(null);

        if (existing == null) {
            return null;
        }

        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        existing.setPassword(user.getPassword());

        return userRepository.save(existing);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    
    @Autowired
    private JwtUtil jwtUtil;
    
    public  User getUserFromToken(String token) {
        token = token.replace("Bearer ", "");
        String email = jwtUtil.extractUsername(token);
        return userRepository.findByEmail(email);
    }
    
    @Override
    public User login(String email, String rawPassword) {
    	
    	System.out.println("Trying login for: " + email);
    	System.out.println("RAW password: " + rawPassword);
//    	System.out.println("HASHED password: " + users.getPassword());
//    	System.out.println("Password matches? " + passwordEncoder.matches(rawPassword, users.getPassword()));


        User user = userRepository.findByEmail(email);

        if (user == null) {
            return null; // email not found
        }

        // compare raw password with hashed password in DB
        if (!passwordEncoder.matches(rawPassword, user.getPassword())) {
            return null; // password mismatch
        }

        return user; // login successful
    }

}
