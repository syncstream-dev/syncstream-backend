package com.syncstream.syncstream.model.message;

import com.syncstream.syncstream.model.user.User;

public class UserMessage extends Message {
    private User sender;
    private Boolean flag;

    public UserMessage(String mid, long timestamp, String content, User sender, Boolean flag) {
        super(mid, timestamp, content);
        this.sender = sender;
        this.flag = flag;
    }

    public User getSender() {
        return sender;
    }

    public Boolean flag() {
        return flag;
    }
}
