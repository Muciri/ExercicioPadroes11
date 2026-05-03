public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if(email.endsWith("@admin.email.com")) {
            if (hasNext()){
                return checkNext(email, password);
            } else {
                return true;
            }
        }
        return false;
    }
}
