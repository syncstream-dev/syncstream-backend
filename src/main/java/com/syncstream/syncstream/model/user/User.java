package com.syncstream.syncstream.model.user;

import java.time.LocalDateTime;


public class User {
    private UserInfo userInfo;
    private String uid;     // User id
    private String username;
    private int messagesSent;
    private int points;

    // Register User Constructor
    public User(String uid, String username, String token, String email, String password, String avatarUrl) {
        // Todo: Database integration
        this.userInfo = new UserInfo(token, email, password, LocalDateTime.now(), LocalDateTime.now(), avatarUrl);
        this.uid = uid;
        this.username = username;
        this.messagesSent = 0;
        this.points = 0;
    }

    // Login User Constructor
    public User(String username, String password) {
        throw new UnsupportedOperationException("Not implemented yet.");    // Todo: Requires database integration to load user info
    }

    // Getters
    public String getUserToken() {
        return userInfo.getToken();
    }

    public String getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public int getMessagesSent() {
        return messagesSent;
    }

    public int getPoints() {
        return points;
    }

    // Overrides
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return uid.equals(user.uid);
    }

    @Override
    public int hashCode() {
        return uid.hashCode();
    }
}
