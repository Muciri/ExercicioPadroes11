public class Middleware {
    private Middleware next;

    public void linkWith(Middleware next) {
        this.next = next;
    }
    
    public boolean check(String email, String password) {
        return true;
    }

    protected boolean checkNext(String email, String password) {
        return next.check(email, password);
    }

    protected boolean hasNext() {
        return this.next != null;
    }
}
