package com.syncstream_dev.syncstream.model.message;

public abstract class Message {
    protected String messageId;
    protected long timestamp;
    protected String content;

    public Message(String messageId, long timestamp, String content) {
        this.messageId = messageId;
        this.timestamp = timestamp;
        this.content = content;
    }

    public String getMessageId() {
        return messageId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }
}
