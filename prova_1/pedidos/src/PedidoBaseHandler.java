public abstract class PedidoBaseHandler implements PedidoHandler {
    protected PedidoHandler next;

    public void setNext(PedidoHandler pedidoHandler) {
        this.next = pedidoHandler;
    }

    public void processar(Pedido pedido) {}

    public boolean hasNext() {
        return this.next != null;
    }
}
