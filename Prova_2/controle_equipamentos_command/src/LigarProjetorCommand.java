public class LigarProjetorCommand implements Comando {
    private Projetor projetor;

    public LigarProjetorCommand(Projetor projetor) {
        this.projetor = projetor;
    }

    public void executar() {
        projetor.ligar();
    }
}
