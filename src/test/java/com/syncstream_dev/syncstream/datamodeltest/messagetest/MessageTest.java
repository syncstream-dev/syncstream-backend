package com.syncstream_dev.syncstream.datamodeltest.messagetest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.syncstream_dev.syncstream.model.message.Message;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {
    private String messageId;
    private long timestamp;
    private String content;
    private Message message;

    @BeforeEach
    public void setUp() {
        messageId = "testMessageId";
        timestamp = 1234567890L;
        content = "testContent";
        message = new Message(messageId, timestamp, content) {};
    }

    @Test
    public void testMessageGetters() {
        assertEquals(messageId, message.getMessageId());
        assertEquals(timestamp, message.getTimestamp());
        assertEquals(content, message.getContent());
    }

}
