public class Recebido implements EstadoPedido{
    private Loja loja;
    
    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public String informar() {
        return "o pedido foi recebido";
    }

    public void avancar() {
        Finalizado finalizado = new Finalizado();
        finalizado.setLoja(loja);
        loja.mudarEstado(finalizado);
    }

    public void devolver() {
        Preparacao preparacao = new Preparacao();
        preparacao.setLoja(loja);
        loja.mudarEstado(preparacao);
    }
}
