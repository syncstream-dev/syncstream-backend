// message.rs implements the Message module

pub struct Message {
    id: Id,
    timestamp: Long,
    content: String,
}

impl Message {
    pub fn new(id: String, timestamp: Long, content: String) -> Message {
        Message {
            id,
            timestamp,
            content,
        }
    }
}
