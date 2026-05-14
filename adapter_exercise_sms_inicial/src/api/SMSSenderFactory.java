package api;

public class SMSSenderFactory {
    public SMSSender criarServico(String numero) {
        SMSSender servico = new TimServiceAdapter(new TimService());

        if(numero.startsWith("15")) {
            servico = new VivoServiceAdapter(new VivoService());
        }

        return servico;
    }
}
