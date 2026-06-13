public class Loja {
    private EstadoPedido estadoPedido;

    public Loja(EstadoPedido estadoPedido) {
        estadoPedido.setLoja(this);
        this.estadoPedido = estadoPedido;
    }

    public void mudarEstado(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String informar() {
        return this.estadoPedido.informar();
    }

    public void avancar() {
        this.estadoPedido.avancar();
    }

    public void devolver() {
        this.estadoPedido.devolver();
    }
}
