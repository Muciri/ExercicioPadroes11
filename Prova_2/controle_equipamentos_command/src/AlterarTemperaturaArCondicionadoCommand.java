public class AlterarTemperaturaArCondicionadoCommand implements Comando{
    private ArCondicionado arCondicionado;
    private int temperatura;

    public AlterarTemperaturaArCondicionadoCommand(ArCondicionado arCondicionado, int temperatura){
        this.arCondicionado = arCondicionado;
        this.temperatura = temperatura;
    }

    @Override
    public void executar() {
        arCondicionado.alterarTemperatura(temperatura);
    }
}
