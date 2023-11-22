package com.syncstream.syncstream.model.session;

import com.syncstream.syncstream.model.ChatStream;
import com.syncstream.syncstream.model.Genre;
import com.syncstream.syncstream.model.VideoInfo;

public class PrivateSession extends Session {
    /*
     *   password: String,
    max_viewers: int,
     */
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
