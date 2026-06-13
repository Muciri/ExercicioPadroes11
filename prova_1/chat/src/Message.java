public class Message {
    private User user;
    private String content;

    public Message(User user, String content) {
        this.user = user;
        this.content = content;
    }

    @Override
    public String toString() {
        return user + " - " + content;
    }
}
