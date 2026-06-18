public class Projetor implements Equipamento{
    private boolean isLigado = false;

    @Override
    public void ligar() {
        if(!isLigado) {
            System.out.println("projetor ligado...");
            isLigado = true;
        }
    }

    @Override
    public void desligar() {
        if(isLigado){
            System.out.println("projetor desligado...");
            isLigado = false;
        }
    }
}
