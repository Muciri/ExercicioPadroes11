public class AmareloState implements State {
    private Semaforo semaforo;
    private int tempoTransicao = 1;

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public void efetuarTransicao() {
        State estado = new VermelhoState();
        estado.setSemaforo(semaforo);

        semaforo.mudarEstadoAtual(estado);
    }

    public Sinal getSinal() {
        return Sinal.AMARELO;
    }

    public int getTempoTransicao() {
        return this.tempoTransicao;
    }

    public void exibir() {
        System.out.println(" vermelho  (   )");
        System.out.println(" amarelo   ( X )");
        System.out.println(" verde     (   )");
    }
}
