package com.syncstream_dev.syncstream.model;

import java.util.ArrayList;
import java.util.HashMap;

import com.syncstream_dev.syncstream.model.message.Message;
import com.syncstream_dev.syncstream.model.message.UserMessage;
import com.syncstream_dev.syncstream.model.user.User;

public class ChatStream {
    private HashMap<String, Message> messages;      // Message id to Message mapping
    private ArrayList<User> participants;

    public ChatStream() {
        messages = new HashMap<String, Message>();
        participants = new ArrayList<User>();
    }

    public void insertMessage(Message msg) {
        if (msg instanceof UserMessage) {
            UserMessage uMsg = (UserMessage) msg;
            if (!participants.contains(uMsg.getSender())) {
                participants.add(uMsg.getSender());
            }
        }

        messages.put(msg.getMid(), msg);
    }

    public Message getMessage(String mid) {    // accepts message id (mid)
        return messages.get(mid);
    }

    public Boolean userPresent(User user) {
        return participants.contains(user);
    }
}
