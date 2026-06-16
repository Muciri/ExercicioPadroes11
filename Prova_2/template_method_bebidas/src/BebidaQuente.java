public abstract class BebidaQuente {
    public void prepararBebida() {
        ferverAgua();
        prepararInfusao();
        adicionarComplemento();
        servir();
    }

    protected void ferverAgua() {
        System.out.println("fervendo agua...");
    }

    protected abstract void prepararInfusao();

    protected abstract void adicionarComplemento();

    protected void servir() {
        System.out.println("servindo...");
    }
}
