public class NotificationService {
    private NotificationFactory factory;

    public void setFactory(NotificationFactory factory) {
        this.factory = factory;
    }

    public void notificar(String notificacao) {
        Notification notificador = factory.createNotification();

        System.out.println("conectando ao serviço");
        notificador.notifyUser(notificacao);
        System.out.println("desconectando do serviço");
    }
}
