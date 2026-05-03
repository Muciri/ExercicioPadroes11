public interface PagamentoStrategy {    
    public void coletarDados();
    public String processarPagamento(int valorTotal);
}
