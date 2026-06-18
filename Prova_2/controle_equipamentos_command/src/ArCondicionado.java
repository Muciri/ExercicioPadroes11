public class ArCondicionado implements Equipamento{
    private boolean isLigado = false;
    private int temperatura = 0;

    @Override
    public void ligar() {
        if(!isLigado) {
            isLigado = true;
            System.out.println("ar condicionado ligado...");
        }
    }

    @Override
    public void desligar() {
        if(isLigado){
            isLigado = false;
            System.out.println("ar condicionado desligado...");
        }
    }

    public void alterarTemperatura(int temperatura){
        System.out.println("mudando temperatura de: " + this.temperatura + " para: " + temperatura);
        this.temperatura = temperatura;
    }
}
