package com.syncstream.syncstream.model;

public class VideoInfo {
    private String url;
    private String title;
    private Long timestamp;

    public VideoInfo(String url, String title, Long timestamp)  {
        this.url = url;
        this.title = title;
        this.timestamp = timestamp;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}
