// chatstream.rs implements the Genre module
use std::collections::HashMap;

pub struct Chatstream {
    messages: HashMap<id: String, message: Message>,
    participants: Vec<User>,
}

impl Chatstream {
    fn new() -> Self {
        Self {
            messages: HashMap::new(),
            participants: Vec::new(),
        }
    }
}
