package com.syncstream_dev.syncstream.model.session;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.Genre;
import com.syncstream_dev.syncstream.model.VideoInfo;

public class PrivateSession extends Session {
    private String password;
    private int maxViewers;

    public PrivateSession(String sessionId, Genre genre, ChatStream chatStream, VideoInfo videoInfo, String password, int maxViewers) {
        super(sessionId, genre, chatStream, videoInfo);
        this.password = password;
        this.maxViewers = maxViewers;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxViewers() {
        return maxViewers;
    }
}
