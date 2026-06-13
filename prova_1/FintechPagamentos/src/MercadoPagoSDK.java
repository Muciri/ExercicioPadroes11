public class MercadoPagoSDK {
    private String acessToken;

    public MercadoPagoSDK(String acessToken) {
        this.acessToken = acessToken;
    }

    public ResultadoMP criarPagamento(String descricao, double valor) {
        return new ResultadoMP(true, "mp_123", "APROVADO");
    }

    public String estadoDoPagamento(String idPagamento) {
        return "APROVADO";
    }

    public ResultadoMP reembolsarPagamento(String idPagamento) {
        return new ResultadoMP(true, idPagamento, "REEMBOLSADO");
    }

    public boolean verificarUsuario(String cpf) {
        return cpf != null && cpf.length() == 11;
    }
}
