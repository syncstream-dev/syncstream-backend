package com.syncstream_dev.syncstream.datamodeltest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.message.UserMessage;
import com.syncstream_dev.syncstream.model.User;

import java.util.UUID;

public class ChatStreamTest {
    private ChatStream chatStream;
    private User user;
    private UserMessage userMessage;

    @BeforeEach
    public void init() {
        chatStream = new ChatStream();
        user = new User(UUID.randomUUID(), "testUser", "123", "testUser@test.com", "123", "avatar-url.png");
        userMessage = new UserMessage("1", 100, "Hello, world!", user, false);
    }

    @Test
    public void testInsertMessage() {
        chatStream.insertMessage(userMessage);
        assertEquals(userMessage, chatStream.getMessage(userMessage.getMessageId()));
        assertTrue(chatStream.userPresent(user));
    }
}

