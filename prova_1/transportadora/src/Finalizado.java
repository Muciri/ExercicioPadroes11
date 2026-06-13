public class Finalizado implements EstadoPedido{
    private Loja loja;
    
    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public String informar() {
        return "o pedido está finalizado";
    }

    public void avancar() {}

    public void devolver() {}
}
