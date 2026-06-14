public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.setFactory(new SMSNotificationFactory());
        service.notificar("o Brasil ganhou o hexa");

        service.setFactory(new EmailNotificationFactory());
        service.notificar("saiu o GTA 6!");
    }
}
