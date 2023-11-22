// user.rs implements the User module
use chrono::offset::Local;
use chrono::DateTime;

pub struct User {
    userInfo: UserInfo,
    id: String,
    username: String,
    messages_sent: int,
    points: int,
}

impl User {
    pub fn create_user(id: String,
        username: String,
        messages_sent: int,
        points: int,
        token: String,
        email: String,
        password: String,
        avatar_url: String,
    ) -> Self {
        let userInfo = UserInfo::new(token, email, password, Local::now(), Local::now(), avatar_url);
        Self {
            id,
            username,
            messages_sent,
            points,
        }
    }
}
