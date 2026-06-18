public class ControleRemoto {
    private Comando comando;

    public ControleRemoto() {}

    public void setComando(Comando comando){
        this.comando = comando;
    }

    public void executar() {
        comando.executar();
    }
}
