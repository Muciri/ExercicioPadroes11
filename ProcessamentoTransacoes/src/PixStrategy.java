public class PixStrategy extends BaseStrategy {
    public PixStrategy(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void processarPagamento(String pagador, String recebedor, double valor) {
        System.out.println("Processando com Pix...");
    }

    @Override
    public void enviarRecibo(String pagador, String recebedor, double valor) {
        System.out.println("Recibo Pix - Pagador: " + pagador + ", Recebedor: " + recebedor + ", Valor: " + valor);
    }
}