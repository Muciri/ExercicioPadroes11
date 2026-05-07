public class BaseHandler implements Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public void processar(Cafe cafe) {}
}
