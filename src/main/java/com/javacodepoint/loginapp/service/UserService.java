package com.javacodepoint.loginapp.service;

import com.javacodepoint.loginapp.entity.User;
import com.javacodepoint.loginapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean validateUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user != null;
    }
}
