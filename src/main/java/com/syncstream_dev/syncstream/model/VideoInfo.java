package com.syncstream_dev.syncstream.model;

public class VideoInfo {
    private String url;
    private String title;
    private long timestamp;

    public VideoInfo(String url, String title, long timestamp)  {
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

    public long getTimestamp() {
        return timestamp;
    }

    public VideoInfo setUrl(String url) {
        this.url = url;
        return this;
    }

    public VideoInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public VideoInfo setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}
