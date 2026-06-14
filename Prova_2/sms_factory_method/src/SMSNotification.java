import java.util.List;

public class SMSNotification implements Notification {
    public SMSNotification() {}

    @Override
    public void notifyUser(String notificacao) {
        System.out.println("SMS - " + notificacao);
    }
}
