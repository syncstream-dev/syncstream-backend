use crate::session::session::Session;

pub mod session;

fn main() {
    println!("Hello, world!");
    let sess: Session = Session::new(
        "id".to_string(),
        "host".to_string(),
        "genre".to_string(),
        vec!["part".to_string()],
        "chatstream".to_string(),
        "videoinfo".to_string(),
    );

    println!("{:?}", sess);
}
