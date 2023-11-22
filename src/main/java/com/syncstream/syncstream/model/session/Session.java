package com.syncstream.syncstream.model.session;

import java.util.ArrayList;

import com.syncstream.syncstream.model.ChatStream;
import com.syncstream.syncstream.model.Genre;
import com.syncstream.syncstream.model.VideoInfo;
import com.syncstream.syncstream.model.user.User;

public abstract class Session {
    protected String sid;       // Session id
    protected Genre genre;
    protected ArrayList<User> participants;
    protected ChatStream chatstream;
    protected VideoInfo videoinfo;

    // Create new session
    public Session(String sid, Genre genre, ChatStream chatstream, VideoInfo videoinfo) {
        this.sid = sid;
        this.genre = genre;
        this.participants = new ArrayList<User>();
        this.chatstream = chatstream;
        this.videoinfo = videoinfo;
    }

    public String getSid() {
        return sid;
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
