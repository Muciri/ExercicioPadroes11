public class ProcessadorPagamento extends PedidoBaseHandler {
    @Override
    public void processar(Pedido pedido) {
        int total = 0;

        for(Produto produto : pedido.getProdutos()) {
            total += produto.getPreco();
        }

        if(pedido.isFreteCalculado()) {
            total += 10;
        }

        if (pedido.isDescontoAplicado()) {
            total = Math.max(0, total - 100);
        }

        pedido.setValorDoPedido(total);

        pedido.setPagamentoRealizado(true);

        if (hasNext()) {
            next.processar(pedido);
        }
    }
}
