package com.syncstream_dev.syncstream.service;

import com.syncstream_dev.syncstream.model.User;
import com.syncstream_dev.syncstream.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(String username, String email, String password, String avatarUrl) throws Exception {
        // Sample instantiation:
        //  User john = new User("1", "John", "token", "test@example.com", "password", "avatarUrl");
        // Check if user already exists and throw an exception if they do
        // Save the user to the database
        // Return the saved user
    }

    public User login(String username, String password) throws Exception {
        // Retrieve the user from the database
        // Check the password and throw an exception if it doesn't match
        // Return the user
    }
}
