package com.syncstream_dev.syncstream.datamodeltest.messagetest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.syncstream_dev.syncstream.model.message.SysMessage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SysMessageTest {
    private String mid;
    private long timestamp;
    private String content;
    private SysMessage sysMessage;

    @BeforeEach
    public void setUp() {
        mid = "testMid";
        timestamp = 1234567890L;
        content = "testContent";
        sysMessage = new SysMessage(mid, timestamp, content);
    }

    @Test
    public void testSysMessageGetters() {
        assertEquals(mid, sysMessage.getMid());
        assertEquals(timestamp, sysMessage.getTimestamp());
        assertEquals(content, sysMessage.getContent());
    }
}


