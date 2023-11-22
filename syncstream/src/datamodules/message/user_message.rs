// user_message.rs implements the UserMessage module

pub struct UserMessage {
    sender: User,
    flagged: Bool,
}

impl UserMessage {
    pub fn new(sender: User, flagged: Bool)  -> Self {
        UserMessage {
            sender,
            flagged,
        }
    }
}
