package com.syncstream_dev.syncstream.datamodeltest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.syncstream_dev.syncstream.model.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    private User user;

    @BeforeEach
    public void init() {
        user = new User("1", "TestUser", "token", "test@example.com", "password", "avatarUrl");
    }

    @Test
    public void testUserGetters() {
        assertEquals("1", user.getUserId());
        assertEquals("TestUser", user.getUsername());
        assertEquals("token", user.getToken());
        assertEquals(0, user.getMessagesSent());
        assertEquals(0, user.getPoints());
        assertEquals("test@example.com", user.getEmail());
        assertArrayEquals("password".toCharArray(), user.getPassword());
        assertEquals("avatarUrl", user.getAvatarUrl());
        assertNotNull(user.getCreationDate());
        assertNotNull(user.getLastLogin());
    }

    @Test
    public void testEquals() {
        User sameUser = new User("1", "TestUser", "token", "test@example.com", "password", "avatarUrl");
        User differentUser = new User("2", "TestUser2", "token2", "test2@example.com", "password2", "avatarUrl2");
        assertEquals(user, sameUser);
        assertNotEquals(user, differentUser);
    }

    @Test
    public void testHashCode() {
        User sameUser = new User("1", "TestUser", "token", "test@example.com", "password", "avatarUrl");
        User differentUser = new User("2", "TestUser2", "token2", "test2@example.com", "password2", "avatarUrl2");
        assertEquals(user.hashCode(), sameUser.hashCode());
        assertTrue(user.hashCode() != differentUser.hashCode());
    }

}
