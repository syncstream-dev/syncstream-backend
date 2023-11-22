mod datamodules::video_info::VideoInfo;

#[test]
fn test_video_info() {
    let video_info = VideoInfo::new(
        "https://www.example.com".to_string(), 
        "Test Video".to_string(), 
        123456789
    );

    assert_eq!(video_info.url, "https://www.example.com");
    assert_eq!(video_info.title, "Test Video");
    assert_eq!(video_info.timestamp, 123456789);
}
