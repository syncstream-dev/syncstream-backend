package com.syncstream_dev.syncstream.model.session;

import java.util.ArrayList;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.Genre;
import com.syncstream_dev.syncstream.model.VideoInfo;
import com.syncstream_dev.syncstream.model.user.User;

public abstract class Session {
    protected String sessionId;
    protected Genre genre;
    protected ArrayList<User> participants;
    protected ChatStream chatstream;
    protected VideoInfo videoinfo;

    // Create new session
    public Session(String sessionId, Genre genre, ChatStream chatstream, VideoInfo videoinfo) {
        this.sessionId = sessionId;
        this.genre = genre;
        this.participants = new ArrayList<User>();
        this.chatstream = chatstream;
        this.videoinfo = videoinfo;
    }

    public String getSessionId() {
        return sessionId;
    }

    public Genre getGenre() {
        return genre;
    }

    public ArrayList<User> getPartcipants() {
        return participants;
    }

    public ChatStream getChatstream() {
        return chatstream;
    }

    public VideoInfo getVideoinfo() {
        return videoinfo;
    }
}
