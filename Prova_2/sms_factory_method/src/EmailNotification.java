import java.util.List;

public class EmailNotification implements Notification {
    public EmailNotification() {}

    @Override
    public void notifyUser(String notificacao) {
        System.out.println("Email - " + notificacao);
    }
}
