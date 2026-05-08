public class VermelhoState implements State {
    private Semaforo semaforo;
    private int tempoTransicao = 3;

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public void efetuarTransicao() {
        State estado = new VerdeState();
        estado.setSemaforo(semaforo);

        semaforo.mudarEstadoAtual(estado);
    }

    public Sinal getSinal() {
        return Sinal.VERMELHO;
    }

    public int getTempoTransicao() {
        return this.tempoTransicao;
    }

    public void exibir() {
        System.out.println(" vermelho  ( X )");
        System.out.println(" amarelo   (   )");
        System.out.println(" verde     (   )");
    }
}
