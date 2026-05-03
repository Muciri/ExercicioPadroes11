public class Main {
    public static void main(String[] args) {
        MercadoPagoSDK mercadoPagoSDK = new MercadoPagoSDK("uuid");
        ProvedorPagamento provedorPagamento = new MercadoPagoAdapter(mercadoPagoSDK);

        boolean pago = provedorPagamento.processarPagamento("PED001", 150.0, "BRL");
        System.out.println("Pagamento realizado: " + pago);

        String status = provedorPagamento.verificarStatus("mp_123");
        System.out.println("Status: " + status);

        boolean estorno = provedorPagamento.estornarPagamento("mp_123");
        System.out.println("Estorno: " + estorno);

        boolean valido = provedorPagamento.validarDados("12345678901");
        System.out.println("Cliente válido: " + valido);
    }
}
