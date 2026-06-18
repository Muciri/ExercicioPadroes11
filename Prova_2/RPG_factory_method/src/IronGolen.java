public class IronGolen implements Criatura {
    @Override
    public void atacar() {
        System.out.println("Golem desfere um golpe de Ferro");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Golem ativa Armadura Rochosa!");
    }

    @Override
    public int getCustoHabilidadeEspecial(){
        return 4;
    }
}