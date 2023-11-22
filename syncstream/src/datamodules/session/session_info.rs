// session_info.rs implements the composition module SessionInfo

pub struct SessionInfo {
    id: Id,
    genre: Genre,
    participants: Vec<User>,
    chat_stream: String,
    video_info: String,
}

impl SessionInfo {
    pub fn new(
        id: Id,
        genre: Genre,
        participants: Vec<User>,
        chat_stream: String,
        video_info: String,
    ) -> Self {
        SessionInfo {
            id,
            host,
            genre,
            participants,
            chat_stream,
            video_info,
        }
    }
}
