public class CalculoFreteHandler extends PedidoBaseHandler{
    @Override
    public void processar(Pedido pedido) {
        pedido.setFreteCalculado(true);

        if (hasNext()) {
            next.processar(pedido);
        }
    }
}
