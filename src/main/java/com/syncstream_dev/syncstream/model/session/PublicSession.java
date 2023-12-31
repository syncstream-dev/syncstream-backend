package com.syncstream_dev.syncstream.model.session;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.Genre;
import com.syncstream_dev.syncstream.model.VideoInfo;

public class PublicSession extends Session {
    public PublicSession(String sessionId, Genre genre, ChatStream chatStream, VideoInfo videoInfo) {
        super(sessionId, genre, chatStream, videoInfo);
    }
}
