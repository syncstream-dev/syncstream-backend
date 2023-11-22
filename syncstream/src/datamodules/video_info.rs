// video_info.rs implements the VideoInfo module

pub struct VideoInfo {
    url: String,
    title: String,
    timestamp: Long,
}

impl VideoInfo {
    fn new(url: String, title: String, timestamp: Long) -> Self {
        VideoInfo {
            url,
            title,
            timestamp,
        }
    }
}
