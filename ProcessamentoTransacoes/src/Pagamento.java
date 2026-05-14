public interface Pagamento {
    void transacao(String pagador, String recebedor, double valor);
}