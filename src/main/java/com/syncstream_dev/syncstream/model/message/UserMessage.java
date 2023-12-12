package com.syncstream_dev.syncstream.model.message;

import com.syncstream_dev.syncstream.model.User;

public class UserMessage extends Message {
    private User sender;
    private boolean flag;

    public UserMessage(String messageId, long timestamp, String content, User sender, boolean flag) {
        super(messageId, timestamp, content);
        this.sender = sender;
        this.flag = flag;
    }

    public User getSender() {
        return sender;
    }

    public boolean isFlag() {
        return flag;
    }
}
