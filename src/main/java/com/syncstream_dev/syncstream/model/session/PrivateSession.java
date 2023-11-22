package com.syncstream_dev.syncstream.model.session;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.Genre;
import com.syncstream_dev.syncstream.model.VideoInfo;

public class PrivateSession extends Session {
    private String password;
    private int maxViewers;

    public PrivateSession(String sid, Genre genre, ChatStream chatstream, VideoInfo videoinfo, String password, int maxViewers) {
        super(sid, genre, chatstream, videoinfo);
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
