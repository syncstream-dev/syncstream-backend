package com.syncstream_dev.syncstream.datamodeltest.sessiontest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.Genre;
import com.syncstream_dev.syncstream.model.VideoInfo;
import com.syncstream_dev.syncstream.model.session.Session;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SessionTest {

    private Session session;
    private ChatStream chatStream;
    private VideoInfo videoInfo;

    @BeforeEach
    public void init() {
        chatStream = new ChatStream();
        videoInfo = new VideoInfo("http://example.com", "Example Title", 123456789L);
        session = new Session("1", Genre.CODING, chatStream, videoInfo) {};
    }

    @Test
    public void testSessionGetters() {
        assertEquals("1", session.getSessionId());
        assertEquals(Genre.CODING, session.getGenre());
        assertEquals(chatStream, session.getChatStream());
        assertEquals(videoInfo, session.getVideoInfo());
    }
}

