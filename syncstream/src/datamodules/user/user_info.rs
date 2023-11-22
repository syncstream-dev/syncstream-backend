// user_info.rs implements the UserInfo module
use chrono::offset::Local;
use chrono::DateTime;

pub struct UserInfo {
    token: String,
    email: String,
    password: String,
    creation_date: DateTiem<Local>,
    last_login: DateTime<Local>,
    avatar_url: String
}

impl UserInfo {
    pub fn new(token: String,
        email: String,
        password: String,
        creation_date: DateTime<Local>,
        last_login: DateTime<Local>,
        avatar_url: String,
    ) -> Self {
        UserInfo {
            token,
            email,
            password,
            creation_date,
            last_login,
            avatar_url,
        }
    }
}
