public class Facebook extends SocialNetwork{

    public Facebook(String username, String password) {
        super(username, password);
    }

    @Override
    protected void loging(String username, String password) {
        System.out.println("o usuário foi logado no Facebook: " + username + "/" + password);
    }

    @Override
    protected void sendData(String data) {
        System.out.println("mensagem enviada: " +data);
    }

    @Override
    protected void logout() {
        System.out.println("usuário deslogado do Facebook");
    }
}
