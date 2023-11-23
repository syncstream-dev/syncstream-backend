package com.syncstream_dev.syncstream.datamodeltest.sessiontest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.Genre;
import com.syncstream_dev.syncstream.model.VideoInfo;
import com.syncstream_dev.syncstream.model.session.PublicSession;

public class PublicSessionTest {

    private PublicSession publicSession;
    private ChatStream chatStream;
    private VideoInfo videoInfo;

    @BeforeEach
    public void init() {
        chatStream = new ChatStream();
        videoInfo = new VideoInfo("http://example.com", "Example Title", 123456789L);
        publicSession = new PublicSession("1", Genre.CODING, chatStream, videoInfo);
    }

    @Test
    public void testPublicSessionGetters() {
        assertEquals("1", publicSession.getSessionId());
        assertEquals(Genre.CODING, publicSession.getGenre());
        assertEquals(chatStream, publicSession.getChatstream());
        assertEquals(videoInfo, publicSession.getVideoinfo());
    }
}
