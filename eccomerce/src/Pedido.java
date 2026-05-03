public class Pedido {
    private int valorTotal;
    private PagamentoStrategy metodoPagamento;

    public Pedido(int valorTotal, PagamentoStrategy metodoPagamento) {
        this.valorTotal = valorTotal;
        this.metodoPagamento = metodoPagamento;
    }

    public Pedido(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setMetodoPagamento(PagamentoStrategy metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String pagar() {
        metodoPagamento.coletarDados();
        return metodoPagamento.processarPagamento(valorTotal);
    }
}
