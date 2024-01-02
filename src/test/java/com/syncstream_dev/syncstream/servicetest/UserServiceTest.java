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
    public void testRegisterAndLogin() throws Exception {
        User user = new User(UUID.randomUUID(), "username", "token", "email", "password", "avatarUrl");
        when(userRepository.existsByUsername(user.getUsername())).thenReturn(false);
        when(userRepository.existsByEmail(user.getEmail())).thenReturn(false);
        when(userRepository.existsById(user.getUserId())).thenReturn(false);
        when(userRepository.save(any(User.class))).thenReturn(user);

        User result = userService.register(user.getUsername(), user.getEmail(), Arrays.toString(user.getPassword()), user.getAvatarUrl());

        assertEquals(user, result);
        verify(userRepository, times(1)).save(user);
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
