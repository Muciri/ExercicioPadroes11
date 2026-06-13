public abstract class BaseStrategy implements Pagamento {
    protected Plataforma plataforma;

    public BaseStrategy(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void transacao(String pagador, String recebedor, double valor) {
        if (validarDados(pagador, recebedor, valor) && usuarioAutenticado(pagador)) {
            processarPagamento(pagador, recebedor, valor);
            enviarRecibo(pagador, recebedor, valor);
        } else {
            System.out.println("Falha na validação da transação.");
        }
    }

    public abstract void processarPagamento(String pagador, String recebedor, double valor);
    public abstract void enviarRecibo(String pagador, String recebedor, double valor);

    public boolean validarDados(String pagador, String recebedor, double valor) {
        return plataforma.getUsuarios().contains(pagador) && 
               plataforma.getUsuarios().contains(recebedor) && 
               valor > 0;
    }

    public boolean usuarioAutenticado(String usuario) {
        return plataforma.getUsuarios().contains(usuario);
    }
}