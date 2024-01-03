package com.syncstream_dev.syncstream.servicetest;

import com.syncstream_dev.syncstream.model.User;
import com.syncstream_dev.syncstream.repository.UserRepository;
import com.syncstream_dev.syncstream.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRegister() throws Exception {
        String username = "username";
        String email = "email";
        String password = "password";
        String avatarUrl = "avatarUrl";

        when(userRepository.existsByUsername(username)).thenReturn(false);
        when(userRepository.existsByEmail(email)).thenReturn(false);
        when(userRepository.existsById(any(UUID.class))).thenReturn(false);
        when(userRepository.save(any(User.class))).thenAnswer(i -> i.getArguments()[0]);

        User result = userService.register(username, email, password, avatarUrl);

        assertEquals(username, result.getUsername());
        assertEquals(email, result.getEmail());
        assertEquals(password.toCharArray(), result.getPassword());
        assertEquals(avatarUrl, result.getAvatarUrl());

        verify(userRepository, times(1)).save(any(User.class));
    }


    @Test
    public void testLogin() throws Exception {
        User user = new User(UUID.randomUUID(), "username", "token", "email", "password", "avatarUrl");
        when(userRepository.findByUsername(user.getUsername())).thenReturn(user);

        User result = userService.login(user.getUsername(), Arrays.toString(user.getPassword()));

        assertEquals(user, result);
        verify(userRepository, times(1)).findByUsername(user.getUsername());
    }
}
