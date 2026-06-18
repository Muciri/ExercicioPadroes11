package mediator;

public class SupportTeam {
    private ATCMediator atcMediator = null;

    public SupportTeam(ATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    public void varredura() {
        System.out.println("verificando segurança...");
        atcMediator.atualizar("varreduraCompleta");
    }
}
