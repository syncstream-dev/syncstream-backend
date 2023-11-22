package com.syncstream_dev.syncstream.model.session;

import com.syncstream_dev.syncstream.model.ChatStream;
import com.syncstream_dev.syncstream.model.Genre;
import com.syncstream_dev.syncstream.model.VideoInfo;

public class PublicSession extends Session {
    public PublicSession(String sid, Genre genre, ChatStream chatstream, VideoInfo videoinfo) {
        super(sid, genre, chatstream, videoinfo);
    }
}
