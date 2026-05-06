public class Transportadora implements EstadoPedido{
    private Loja loja;
    
    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public String informar() {
        return "o pedido está com a transportadora";
    }
    
    public void avancar() {
        Recebido recebido = new Recebido();
        recebido.setLoja(loja);
        loja.mudarEstado(recebido);
    }

    public void devolver() {}
}
