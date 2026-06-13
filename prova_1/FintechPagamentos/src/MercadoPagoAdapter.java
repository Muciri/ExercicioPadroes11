public class MercadoPagoAdapter implements ProvedorPagamento {
    private MercadoPagoSDK mercadoPagoSDK;

    public MercadoPagoAdapter(MercadoPagoSDK mercadoPagoSDK) {
        this.mercadoPagoSDK = mercadoPagoSDK;
    }

    public boolean processarPagamento(String idPedido, double valor, String moeda) {
        ResultadoMP resultado = mercadoPagoSDK.criarPagamento("Pedido " + idPedido, valor);
        return resultado.isSucesso();
    }

    public String verificarStatus(String id) {
        return mercadoPagoSDK.estadoDoPagamento(id);
    }

    public boolean estornarPagamento(String id) {
        ResultadoMP resultado = mercadoPagoSDK.reembolsarPagamento(id);

        return resultado != null;
    }

    public boolean validarDados(String dados) {
        return mercadoPagoSDK.verificarUsuario(dados);
    }
}
