package com.syncstream_dev.syncstream.model.user;

import java.time.LocalDateTime;


public class User {
    private UserInfo userInfo;
    private String userId;
    private String username;
    private int messagesSent;
    private int points;

    // Register User Constructor
    public User(String userId, String username, String token, String email, String password, String avatarUrl) {
        // TODO: Database integration
        this.userInfo = new UserInfo(token, email, password, LocalDateTime.now(), LocalDateTime.now(), avatarUrl);
        this.userId = userId;
        this.username = username;
        this.messagesSent = 0;
        this.points = 0;
    }

    // Login User Constructor
    public User(String username, String password) {
        // TODO: Requires database integration to load user info
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    // Getters
    public String getUserToken() {
        return userInfo.getToken();
    }

    public String getUserId() {
        return userId;
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
        return userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }
}
