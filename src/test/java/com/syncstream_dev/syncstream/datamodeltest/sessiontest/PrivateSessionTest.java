package com.syncstream_dev.syncstream.datamodeltest.sessiontest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.Genre;
import com.syncstream_dev.syncstream.model.VideoInfo;
import com.syncstream_dev.syncstream.model.session.PrivateSession;

public class PrivateSessionTest {
    private PrivateSession privateSession;
    private ChatStream chatStream;
    private VideoInfo videoInfo;

    @BeforeEach
    public void init() {
        chatStream = new ChatStream();
        videoInfo = new VideoInfo("http://example.com", "Example Title", 123456789L);
        privateSession = new PrivateSession("1", Genre.CODING, chatStream, videoInfo, "password", 10);
    }

    @Test
    public void testPrivateSessionGetters() {
        assertEquals("1", privateSession.getSessionId());
        assertEquals(Genre.CODING, privateSession.getGenre());
        assertEquals(chatStream, privateSession.getChatStream());
        assertEquals(videoInfo, privateSession.getVideoInfo());
        assertArrayEquals("password".toCharArray(), privateSession.getPassword());
        assertEquals(10, privateSession.getMaxViewers());
    }
}
