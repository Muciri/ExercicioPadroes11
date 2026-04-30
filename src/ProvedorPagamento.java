public interface ProvedorPagamento {
    public boolean processarPagamento(String idPedido, double valor, String moeda);

    public String verificarStatus(String id);

    public boolean estornarPagamento(String id);

    public boolean validarDados(String dados);
}
