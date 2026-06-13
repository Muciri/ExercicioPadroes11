public interface State {
    public void efetuarTransicao();

    public Sinal getSinal();

    public void setSemaforo(Semaforo semaforo);

    public int getTempoTransicao();

    public void exibir();
}
