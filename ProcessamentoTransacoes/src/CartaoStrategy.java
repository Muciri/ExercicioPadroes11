public class CartaoStrategy extends BaseStrategy {
    public CartaoStrategy(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void processarPagamento(String pagador, String recebedor, double valor) {
        verificarOperadora();
        System.out.println("Processando com cartão...");
    }

    @Override
    public void enviarRecibo(String pagador, String recebedor, double valor) {
        System.out.println("Recibo Cartão - Pagador: " + pagador + ", Recebedor: " + recebedor + ", Valor: " + valor);
    }

    private void verificarOperadora() {
        System.out.println("aprovado pela visa");
    }
}