public class UserExistsMiddleware extends Middleware{
    private Server server;
    
    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (server.isValidPassword(email, password)) {
            if (hasNext()){
                return checkNext(email, password);
            } else {
                return true;
            }
        } 
        return false;
    }
}
