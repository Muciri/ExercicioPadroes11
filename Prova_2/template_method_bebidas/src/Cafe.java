public class Cafe extends BebidaQuente{
    @Override
    protected void prepararInfusao() {
        System.out.println("moendo café...");
    }

    @Override
    protected void adicionarComplemento() {
        System.out.println("adicionando açucar ao cafe...");
    }
}
