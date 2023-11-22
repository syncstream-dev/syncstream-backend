// public_session.rs implements the PublicSession module

pub struct PublicSession {
    info: SessionInfo
}

impl PublicSession {
    pub fn new(
        id: Id,
        genre: Genre,
        participants: Vec<User>,
        chat_stream: Chatstream,
        video_info: VideoInfo,
    ) -> Self {
        let sessionInfo = SessionInfo::new(id, genre, participants, chat_stream, video_info);
        PublicSession {
            info: sessionInfo,
        }
    }
}
