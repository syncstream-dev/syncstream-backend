// private_session.rs implements the PrivateSession module

pub struct PrivateSession {
    info: SessionInfo,
    password: String,
    max_viewers: int,
}

impl PrivateSession {
    pub fn new(
        id: String,
        genre: String,
        participants: Vec<String>,
        chat_stream: String,
        video_info: String,
        password: String,
        max_viewers: int,
    ) -> Self {
        let sessionInfo = SessionInfo::new(id, genre, participants, chat_stream, video_info);
        PrivateSession {
            info: sessionInfo,
            password,
            max_viewers,
        }
    }
}
