public interface DispersadorHandler {
    public void setNext(DispersadorHandler next);

    public void processar(int valor);
}
