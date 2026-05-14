import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private List<String> usuarios = new ArrayList<>();
    private Pagamento pagamento;

    public void setUsuarios(List<String> usuarios) {
        this.usuarios = usuarios;
    }

    public List<String> getUsuarios() {
        return usuarios;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void transacao(String pagador, String recebedor, double valor) {
        if (pagamento != null) {
            pagamento.transacao(pagador, recebedor, valor);
        }
    }
}