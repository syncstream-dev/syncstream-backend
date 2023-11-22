package com.syncstream_dev.syncstream.datamodeltest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import com.syncstream_dev.syncstream.model.VideoInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VideoInfoTest {
    private VideoInfo videoInfo;
    private String expectedUrl;
    private String expectedTitle;
    private long expectedTimestamp;

    @BeforeEach
    public void init() {
        expectedUrl = "http://example.com";
        expectedTitle = "Example Title";
        expectedTimestamp = 123456789L;
        videoInfo = new VideoInfo(expectedUrl, expectedTitle, expectedTimestamp);
    }

    @Test
    public void testVideoInfoGetters() {

        assertEquals(expectedUrl, videoInfo.getUrl());
        assertEquals(expectedTitle, videoInfo.getTitle());
        assertEquals(expectedTimestamp, videoInfo.getTimestamp());
    }
}
