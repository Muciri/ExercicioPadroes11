public class DesligarArCondicionadoCommand implements Comando{
    private ArCondicionado arCondicionado;

    public DesligarArCondicionadoCommand(ArCondicionado arCondicionado){
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void executar() {
        arCondicionado.desligar();
    }
}