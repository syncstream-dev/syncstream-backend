package com.syncstream_dev.syncstream.datamodeltest.usertest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.syncstream_dev.syncstream.model.user.UserInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

public class UserInfoTest {

    private UserInfo userInfo;
    private LocalDateTime creationDate;
    private LocalDateTime lastLogin;

    @BeforeEach
    public void init() {
        creationDate = LocalDateTime.now();
        lastLogin = LocalDateTime.now();
        userInfo = new UserInfo("token", "test@example.com", "password", creationDate, lastLogin, "avatarUrl");
    }

    @Test
    public void testUserInfoGetters() {
        assertEquals("token", userInfo.getToken());
        assertEquals("test@example.com", userInfo.getEmail());
        assertEquals("password", userInfo.getPassword());
        assertEquals(creationDate, userInfo.getCreationDate());
        assertEquals(lastLogin, userInfo.getLastLogin());
        assertEquals("avatarUrl", userInfo.getAvatarUrl());
    }
}
