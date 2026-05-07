public class VerificacaoEstoqueHandler extends PedidoBaseHandler{
    private Loja loja;

    public VerificacaoEstoqueHandler(Loja loja) {
        this.loja = loja;
    }

    @Override
    public void processar(Pedido pedido) {
        pedido.setPedidoEmEstoque(verificarEstoque(pedido));

        if (hasNext()) {
            next.processar(pedido);
        }
    }

    private boolean verificarEstoque(Pedido pedido) {
        boolean estoque = true;

        for(Produto produto : pedido.getProdutos()) {
            if(!loja.hasProduto(produto)) {
                estoque = false;
            }
        }

        return estoque;
    }
}
