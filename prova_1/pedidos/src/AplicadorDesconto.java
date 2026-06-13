public class AplicadorDesconto extends PedidoBaseHandler {
    Loja loja;

    public AplicadorDesconto(Loja loja){
        this.loja = loja;
    }

    @Override
    public void processar(Pedido pedido) {
        pedido.setDescontoAplicado(loja.isClienteVip(pedido.getCliente()));

        if (hasNext()) {
            next.processar(pedido);
        }
    }
}
