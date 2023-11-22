package com.syncstream.syncstream.model.session;

import com.syncstream.syncstream.model.ChatStream;
import com.syncstream.syncstream.model.Genre;
import com.syncstream.syncstream.model.VideoInfo;

public class PublicSession extends Session {
    public PublicSession(String sid, Genre genre, ChatStream chatstream, VideoInfo videoinfo) {
        super(sid, genre, chatstream, videoinfo);
    }
}
