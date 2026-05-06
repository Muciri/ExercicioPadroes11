public class Preparacao implements EstadoPedido{
    private Loja loja;
    
    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public String informar() {
        return "o pedido está em preparação";
    }

    public void avancar() {
        Transportadora transportadora = new Transportadora();
        transportadora.setLoja(loja);
        loja.mudarEstado(transportadora);
    }

    public void devolver() {}
}
