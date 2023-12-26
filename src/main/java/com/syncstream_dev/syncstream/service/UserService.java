package com.syncstream_dev.syncstream.service;

import com.syncstream_dev.syncstream.exception.DuplicateEmailException;
import com.syncstream_dev.syncstream.exception.DuplicateUsernameException;
import com.syncstream_dev.syncstream.exception.InvalidPasswordException;
import com.syncstream_dev.syncstream.exception.UsernameNotFoundException;
import com.syncstream_dev.syncstream.model.User;
import com.syncstream_dev.syncstream.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(String username, String email, String password, String avatarUrl) throws Exception {
        // Duplicate username and email check
        if (userRepository.existsByUsername(username)) {
            throw new DuplicateUsernameException("Username already exists");
        } else if (userRepository.existsByEmail(email)) {
            throw new DuplicateEmailException("Email already registered with an account");
        }

        // userId and token generation
        UUID newUserId;
        do {
            newUserId = UUID.randomUUID();
        } while (userRepository.existsById(newUserId));
        String newToken = UUID.randomUUID().toString();

        // Save and return newUser
        User newUser = new User(newUserId, username, newToken, email, password, avatarUrl);
        userRepository.save(newUser);
        return newUser;
    }

    public User login(String username, String password) throws Exception {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Username does not exist in database");
        } else if (!Arrays.equals(user.getPassword(), password.toCharArray())) {
            throw new InvalidPasswordException("Password is incorrect");
        }

        return user;
    }
}
