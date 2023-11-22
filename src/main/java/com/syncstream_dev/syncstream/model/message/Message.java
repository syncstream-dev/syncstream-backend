package com.syncstream_dev.syncstream.model.message;

public abstract class Message {
    protected String mid;     // Message id
    protected long timestamp;
    protected String content;

    public Message(String mid, long timestamp, String content) {
        this.mid = mid;
        this.timestamp = timestamp;
        this.content = content;
    }

    public String getMid() {
        return mid;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }
}
