package com.syncstream_dev.syncstream.datamodeltest.usertest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.syncstream_dev.syncstream.model.user.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertEquals("token", user.getUserToken());
        assertEquals(0, user.getMessagesSent());
        assertEquals(0, user.getPoints());
    }

    @Test
    public void testEquals() {
        User sameUser = new User("1", "TestUser", "token", "test@example.com", "password", "avatarUrl");
        User differentUser = new User("2", "TestUser2", "token2", "test2@example.com", "password2", "avatarUrl2");
        assertTrue(user.equals(sameUser));
        assertTrue(!user.equals(differentUser));
    }

    @Test
    public void testHashCode() {
        User sameUser = new User("1", "TestUser", "token", "test@example.com", "password", "avatarUrl");
        User differentUser = new User("2", "TestUser2", "token2", "test2@example.com", "password2", "avatarUrl2");
        assertEquals(user.hashCode(), sameUser.hashCode());
        assertTrue(user.hashCode() != differentUser.hashCode());
    }

}
