package com.syncstream_dev.syncstream.model.message;

import com.syncstream_dev.syncstream.model.user.User;

public class UserMessage extends Message {
    private User sender;
    private Boolean flag;

    public UserMessage(String messageId, long timestamp, String content, User sender, Boolean flag) {
        super(messageId, timestamp, content);
        this.sender = sender;
        this.flag = flag;
    }

    public User getSender() {
        return sender;
    }

    public Boolean isFlag() {
        return flag;
    }
}
