package com.syncstream.syncstream.model.user;

import java.time.LocalDateTime;

public class UserInfo {
    private String token;
    private String email;
    private String password;
    private LocalDateTime creationDate;
    private LocalDateTime lastLogin;
    private String avatarUrl;

    public UserInfo(String token, String email, String password, LocalDateTime creationDate, LocalDateTime lastLogin, String avatarUrl) {
        this.token = token;
        this.email = email;
        this.password = password;
        this.creationDate = creationDate;
        this.lastLogin = lastLogin;
        this.avatarUrl = avatarUrl;
    }

    public String getToken() {
        return token;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
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
}
