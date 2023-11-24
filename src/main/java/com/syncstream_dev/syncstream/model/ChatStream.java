package com.syncstream_dev.syncstream.model;

import java.util.ArrayList;
import java.util.HashMap;

import com.syncstream_dev.syncstream.model.message.Message;
import com.syncstream_dev.syncstream.model.message.UserMessage;

public class ChatStream {
    private HashMap<String, Message> messages;      // Message id to Message mapping
    private ArrayList<User> participants;

    public ChatStream() {
        messages = new HashMap<>();
        participants = new ArrayList<>();
    }

    public void insertMessage(Message msg) {
        if (msg instanceof UserMessage userMsg) {
            if (!participants.contains(userMsg.getSender())) {
                participants.add(userMsg.getSender());
            }
        }

        messages.put(msg.getMessageId(), msg);
    }

    public Message getMessage(String mid) {    // accepts message id (mid)
        return messages.get(mid);
    }

    public boolean userPresent(User user) {
        return participants.contains(user);
    }
}
