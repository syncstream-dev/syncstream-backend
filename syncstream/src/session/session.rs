#[derive(Debug)]

pub struct Session {
    id: String,
    host: String,
    genre: String,
    participants: Vec<String>,
    chat_stream: String,
    video_info: String,
}

impl Session {
    pub fn new(
        id: String,
        host: String,
        genre: String,
        participants: Vec<String>,
        chat_stream: String,
        video_info: String,
    ) -> Self {
        Session {
            id,
            host,
            genre,
            participants,
            chat_stream,
            video_info,
        }
    }
}
