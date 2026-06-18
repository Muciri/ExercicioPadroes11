public class LigarArCondicionadoCommand implements Comando{
    private ArCondicionado arCondicionado;

    public LigarArCondicionadoCommand(ArCondicionado arCondicionado){
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void executar() {
        arCondicionado.ligar();
    }
}
