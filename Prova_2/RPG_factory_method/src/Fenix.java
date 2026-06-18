public class Fenix implements Criatura {
    @Override
    public void atacar() {
        System.out.println("Fênix ataca com penas flamejantes!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Fênix renasce das cinzas!");
    }

    @Override
    public int getCustoHabilidadeEspecial(){
        return 2;
    }
}
