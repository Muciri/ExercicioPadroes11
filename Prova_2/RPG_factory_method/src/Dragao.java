public class Dragao implements Criatura {
    @Override
    public void atacar() {
        System.out.println("Dragão lança uma rajada de fogo!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Dragão utiliza Chama Ancestral!");
    }

    @Override
    public int getCustoHabilidadeEspecial(){
        return 5;
    }
}
