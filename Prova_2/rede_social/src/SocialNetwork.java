public abstract class SocialNetwork {
    protected String username;
    protected String password;

    public SocialNetwork(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void post(String msg) {
        loging(this.username, this.password);
        sendData(msg);
        logout();
    }

    protected abstract void loging(String username, String password);
    protected abstract void sendData(String data);
    protected abstract void logout();
}
