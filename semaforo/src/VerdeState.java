public class VerdeState implements State {
    private Semaforo semaforo;
    private int tempoTransicao = 5;

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public void efetuarTransicao() {
        State estado = new AmareloState();
        estado.setSemaforo(semaforo);

        semaforo.mudarEstadoAtual(estado);
    }

    public Sinal getSinal() {
        return Sinal.VERDE;
    }

    public int getTempoTransicao() {
        return this.tempoTransicao;
    }

    public void exibir() {
        System.out.println(" vermelho  (   )");
        System.out.println(" amarelo   (   )");
        System.out.println(" verde     ( X )");
    }
}
