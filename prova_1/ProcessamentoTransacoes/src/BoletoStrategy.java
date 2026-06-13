public class BoletoStrategy extends BaseStrategy {
    public BoletoStrategy(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void processarPagamento(String pagador, String recebedor, double valor) {
        gerarCodigoBarra(pagador, recebedor, valor);
        System.out.println("Processando com boleto: valor " + valor);
    }

    @Override
    public void enviarRecibo(String pagador, String recebedor, double valor) {
        System.out.println("Recibo Boleto - Pagador: " + pagador + ", Recebedor: " + recebedor + ", Valor: " + valor + ", código: ");
    }

    private void gerarCodigoBarra(String pagador, String recebedor, double valor) {
        System.out.println("código: §@uQ┐¹▼╔└");
    }
}