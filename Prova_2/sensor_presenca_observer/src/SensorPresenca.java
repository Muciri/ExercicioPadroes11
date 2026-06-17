import java.util.ArrayList;
import java.util.List;

public class SensorPresenca {
    private List<Aparelho> aparelhos;
    private List<String> docentes;
    private String estado;

    public SensorPresenca() {
        this.aparelhos = new ArrayList<Aparelho>();
        this.docentes = new ArrayList<String>();
        this.estado = "inativo";
    }

    public void adicionarAparelho(Aparelho aparelho) {
        aparelhos.add(aparelho);
    }

    public void removerAparelho(Aparelho aparelho) {
        aparelhos.remove(aparelho);
    }

    public void notificarAparelhos(String acao) {
        for(Aparelho aparelho : aparelhos) {
            aparelho.notificar(acao);
        }
    }

    public String getEstado() {
        return !docentes.isEmpty() ? docentes.toString() : "nenhum docente na sala";
    }

    public void entradaDocente(String docente) {
        System.out.println(docente + " entrou na sala");

        if(this.docentes.isEmpty()) {
            estado = "ativo";
            notificarAparelhos(estado);
        }

        docentes.add(docente);
    }

    public void saidaDocente(String docente) {
        System.out.println(docente + " saiu da sala");

        docentes.remove(docente);

        if(this.docentes.isEmpty()) {
            estado = "inativo";
            notificarAparelhos(estado);
        }
    }
}
