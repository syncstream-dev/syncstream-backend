package com.syncstream_dev.syncstream.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;

@Table("users")
public class User {
    @PrimaryKey
    private String userId;

    private String username;
    private int messagesSent;
    private int points;
    private String token;
    private String email;
    private char[] password;
    private LocalDateTime creationDate;
    private LocalDateTime lastLogin;
    private String avatarUrl;

    // Register User Constructor
    public User(String userId, String username, String token, String email, String password, String avatarUrl) {
        this.userId = userId;
        this.username = username;
        this.messagesSent = 0;
        this.points = 0;
        this.token = token;
        this.email = email;
        this.password = password.toCharArray();
        this.creationDate = LocalDateTime.now();
        this.lastLogin = LocalDateTime.now();
        this.avatarUrl = avatarUrl;
    }

    // Login User Constructor
    public User(String username, String password) {
        // TODO: Requires database integration to load user info
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    // Default Constructor for Cassandra Queries
    protected User() {}

    // Getters
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

    public String getToken() {
        return token;
    }

    public String getEmail() {
        return email;
    }

    public char[] getPassword() {
        return password;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    // Overrides
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User user)) return false;
        return userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }
}
