public class DesligarProjetorCommand implements Comando {
    private Projetor projetor;

    public DesligarProjetorCommand(Projetor projetor) {
        this.projetor = projetor;
    }

    public void executar() {
        projetor.desligar();
    }
}