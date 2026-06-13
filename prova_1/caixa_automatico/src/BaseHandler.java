public class BaseHandler implements DispersadorHandler{
    protected DispersadorHandler next;
    
    public void setNext(DispersadorHandler next) {
        this.next = next;
    }

    protected boolean hasNext() {
        return this.next != null;
    }

    protected boolean verificarValorMultiploDe10(int valor) {
        return valor%10 == 0;
    }

    public void processar(int valor) {}
}
