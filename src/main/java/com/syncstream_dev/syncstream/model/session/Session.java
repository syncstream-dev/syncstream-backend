package com.syncstream_dev.syncstream.model.session;

import java.util.ArrayList;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.Genre;
import com.syncstream_dev.syncstream.model.VideoInfo;
import com.syncstream_dev.syncstream.model.User;

public abstract class Session {
    protected String sessionId;
    protected Genre genre;
    protected ArrayList<User> participants;
    protected ChatStream chatStream;
    protected VideoInfo videoInfo;

    // Create new session
    public Session(String sessionId, Genre genre, ChatStream chatStream, VideoInfo videoInfo) {
        this.sessionId = sessionId;
        this.genre = genre;
        this.participants = new ArrayList<>();
        this.chatStream = chatStream;
        this.videoInfo = videoInfo;
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

    public ChatStream getChatStream() {
        return chatStream;
    }

    public VideoInfo getVideoInfo() {
        return videoInfo;
    }
}
