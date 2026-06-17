public class ProcessadorBoleto extends ProcessadorPagamento{
    @Override
    protected void processarPagamento(String usuario, String descricao, int valor) {
        System.out.println("|-|-|-|-|-|-|-|-|");

        System.out.println(
                "[boleto] Pagamento processado para " + usuario +
                        " | Descrição: " + descricao +
                        " | Valor: R$ " + valor
        );
    }
}
