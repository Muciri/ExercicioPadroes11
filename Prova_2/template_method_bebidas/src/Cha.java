public class Cha extends BebidaQuente{
    @Override
    protected void prepararInfusao() {
        System.out.println("Infundindo o chá...");
    }

    @Override
    protected void adicionarComplemento() {
        System.out.println("Adicionando limão ao cafe...");
    }
}
