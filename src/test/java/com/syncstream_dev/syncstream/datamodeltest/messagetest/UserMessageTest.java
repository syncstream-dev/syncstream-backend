package com.syncstream_dev.syncstream.datamodeltest.messagetest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.syncstream_dev.syncstream.model.message.UserMessage;
import com.syncstream_dev.syncstream.model.user.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserMessageTest {
    private String messageId;
    private long timestamp;
    private String content;
    private User sender;
    private Boolean flag;
    private UserMessage userMessage;

    @BeforeEach
    public void setUp() {
        messageId = "testMessageId";
        timestamp = 1234567890L;
        content = "testContent";
        sender = new User("1", "TestUser", "token", "test@example.com", "password", "avatarUrl");
        flag = true;
        userMessage = new UserMessage(messageId, timestamp, content, sender, flag);
    }

    @Test
    public void testUserMessage() {
        assertEquals(messageId, userMessage.getMessageId());
        assertEquals(timestamp, userMessage.getTimestamp());
        assertEquals(content, userMessage.getContent());
        assertEquals(sender, userMessage.getSender());
        assertEquals(flag, userMessage.flag());
    }
}
