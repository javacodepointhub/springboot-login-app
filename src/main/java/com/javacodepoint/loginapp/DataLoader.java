package com.javacodepoint.loginapp;

import com.javacodepoint.loginapp.entity.User;
import com.javacodepoint.loginapp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        userRepository.save(new User("admin", "admin123"));
    }
}
