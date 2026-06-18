public abstract class Invoker {
    private int mana;

    public Invoker() {
        this.mana = 10;
    }

    public Invoker(int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void atacar() {
        Criatura criatura = invocarCriatura();
        criatura.atacar();
    }

    public void habilidadeEspecial() {
        Criatura criatura = invocarCriatura();

        if(mana >= criatura.getCustoHabilidadeEspecial()) {
            criatura.habilidadeEspecial();
            mana -= criatura.getCustoHabilidadeEspecial();
        } else {
            System.out.println("*barulho de magia falhando*");
        }
    }

    protected abstract Criatura invocarCriatura();
}
