public interface Handler {
    public void setNext(Handler next);

    public void processar(Cafe cafe);
}
