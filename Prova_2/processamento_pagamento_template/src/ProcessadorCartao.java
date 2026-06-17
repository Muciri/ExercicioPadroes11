import java.util.Arrays;
import java.util.List;

public class ProcessadorCartao extends ProcessadorPagamento{
    private List<String> usuarios;

    public ProcessadorCartao() {
        this.usuarios = Arrays.asList("Murilo", "Gabriel", "Rogerio");
    }

    @Override
    protected void processarPagamento(String usuario, String descricao, int valor) {
        if(!usuarios.contains(usuario)) {
            System.out.println("usuario invalido");
            return;
        }

        System.out.println(
                "[cartão] Pagamento processado para " + usuario +
                        " | Descrição: " + descricao +
                        " | Valor: R$ " + valor
        );
    }
}
