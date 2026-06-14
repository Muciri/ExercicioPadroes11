import java.util.ArrayList;
import java.util.List;

class CanalDeNoticias {
    private List<Observer> observadores;

    public CanalDeNoticias() {
        this.observadores = new ArrayList<Observer>();
    }

    public void adicionarObservador(Observer observador) {
        this.observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        this.observadores.remove(observador);
    }

    public void atualizarObservaddores(String noticia) {
        for(Observer observador: observadores) {
            observador.atualizar(noticia);
        }
    }
}