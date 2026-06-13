public class Twitter extends SocialNetwork{

    public Twitter(String username, String password) {
        super(username, password);
    }

    @Override
    protected void loging(String username, String password) {
        System.out.println("usuário logado no Twitter: " + username + " - " + password);
    }

    @Override
    protected void sendData(String data) {
        System.out.println("msg: " +data);
    }

    @Override
    protected void logout() {
        System.out.println("usuário deslogado do Twitter");
    }
}
