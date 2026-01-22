package com.excelR.Job_Portal_Backend.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.excelR.Job_Portal_Backend.model.User;
import com.excelR.Job_Portal_Backend.repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AuthServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    @Override
    public User register(User user) {
        System.out.println("REGISTER RAW PASSWORD = " + user.getPassword());

        String encoded = passwordEncoder.encode(user.getPassword());
        System.out.println("REGISTER ENCODED PASSWORD = " + encoded);

        user.setPassword(encoded);
        return userRepository.save(user);
    }




    @Override
    public User login(String email, String password) {

        User user = userRepository.findByEmail(email);

        System.out.println("LOGIN EMAIL = " + email);
        System.out.println("LOGIN RAW PASSWORD = " + password);
        System.out.println("DB PASSWORD = " + user.getPassword());

        boolean match = passwordEncoder.matches(password, user.getPassword());
        System.out.println("PASSWORD MATCH = " + match);

        if (!match) {
            throw new RuntimeException("Invalid credentials");
        }

        return user;
    }


}