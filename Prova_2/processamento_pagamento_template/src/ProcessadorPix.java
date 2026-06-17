public class ProcessadorPix extends ProcessadorPagamento{
    @Override
    protected void processarPagamento(String usuario, String descricao, int valor) {
        System.out.println("chave: " + usuario);

        System.out.println(
                "[PIX] Pagamento processado para " + usuario +
                        " | Descrição: " + descricao +
                        " | Valor: R$ " + valor
        );
    }
}
