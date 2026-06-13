public interface PedidoHandler {
    public void setNext(PedidoHandler pedidoHandler);
    public void processar(Pedido pedido);
}
