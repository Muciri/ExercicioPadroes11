import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private boolean pedidoEmEstoque;
    private boolean freteCalculado;
    private boolean descontoAplicado;
    private boolean pagamentoRealizado;
    private double valorDoPedido = 0.0;

    private List<Produto> produtos;
    private String cliente;

    public Pedido(boolean pedidoEmEstoque, boolean freteCalculado, boolean descontoAplicado, boolean pagamentoRealizado, String cliente) {
        this.pedidoEmEstoque = pedidoEmEstoque;
        this.freteCalculado = freteCalculado;
        this.descontoAplicado = descontoAplicado;
        this.pagamentoRealizado = pagamentoRealizado;

        this.produtos = new ArrayList<Produto>();
        this.cliente = cliente;
    }

    public Pedido(boolean pedidoEmEstoque, boolean freteCalculado, boolean descontoAplicado, boolean pagamentoRealizado, ArrayList<Produto> produtos, String cliente) {
        this.pedidoEmEstoque = pedidoEmEstoque;
        this.freteCalculado = freteCalculado;
        this.descontoAplicado = descontoAplicado;
        this.pagamentoRealizado = pagamentoRealizado;

        this.produtos = produtos;
        this.cliente = cliente;
    }

    public Pedido(ArrayList<Produto> produtos, String cliente) {
        this.pedidoEmEstoque = false;
        this.freteCalculado = false;
        this.descontoAplicado = false;
        this.pagamentoRealizado = false;

        this.produtos = produtos;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pedidoEmEstoque=" + pedidoEmEstoque +
                ", freteCalculado=" + freteCalculado +
                ", descontoAplicado=" + descontoAplicado +
                ", pagamentoRealizado=" + pagamentoRealizado +
                ", cliente='" + cliente + '\'' +
                ", valorDoPedido=" + valorDoPedido +
                '}';
    }

    public boolean isPedidoEmEstoque() {
        return pedidoEmEstoque;
    }

    public void setPedidoEmEstoque(boolean pedidoEmEstoque) {
        this.pedidoEmEstoque = pedidoEmEstoque;
    }

    public boolean isFreteCalculado() {
        return freteCalculado;
    }

    public void setFreteCalculado(boolean freteCalculado) {
        this.freteCalculado = freteCalculado;
    }

    public boolean isDescontoAplicado() {
        return descontoAplicado;
    }

    public void setDescontoAplicado(boolean descontoAplicado) {
        this.descontoAplicado = descontoAplicado;
    }

    public boolean isPagamentoRealizado() {
        return pagamentoRealizado;
    }

    public void setPagamentoRealizado(boolean pagamentoRealizado) {
        this.pagamentoRealizado = pagamentoRealizado;
    }

    public double getValorDoPedido() {
        return valorDoPedido;
    }

    public void setValorDoPedido(double valorDoPedido) {
        this.valorDoPedido = valorDoPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}