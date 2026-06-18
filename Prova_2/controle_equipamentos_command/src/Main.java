public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        Projetor projetor = new Projetor();
        ArCondicionado arCondicionado = new ArCondicionado();

        controle.setComando(new LigarArCondicionadoCommand(arCondicionado));
        controle.executar();

        controle.setComando(new AlterarTemperaturaArCondicionadoCommand(arCondicionado, 15));
        controle.executar();

        controle.setComando(new LigarProjetorCommand(projetor));
        controle.executar();

        controle.setComando(new AlterarTemperaturaArCondicionadoCommand(arCondicionado, 18));
        controle.executar();

        System.out.println("\n1 hora de aula depois...\n");

        controle.setComando(new DesligarProjetorCommand(projetor));
        controle.executar();

        controle.setComando(new DesligarArCondicionadoCommand(arCondicionado));
        controle.executar();
    }
}
