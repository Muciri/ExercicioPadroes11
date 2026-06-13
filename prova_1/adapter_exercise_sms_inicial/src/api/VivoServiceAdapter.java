package api;

import model.SMS;

public class VivoServiceAdapter implements SMSSender{
    private VivoService vivoService;

    public VivoServiceAdapter(VivoService vivoService) {
        this.vivoService = vivoService;
    }
   
    public boolean sendSMS(SMS sms) {
        try {
            String[] texto = dividirMensagem(sms.getTexto());

            vivoService.enviarSMS(sms.getOrigem(), sms.getDestino(), sms.getTimestamp(), texto);
            System.out.println("Mensagem enviada com sucesso para o número da operadora VIVO");
        } catch (SMSException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    private String[] dividirMensagem(String msg) {
        int tamanhoMaximo = 120;
        int quantidadePartes = (int) Math.ceil((double) msg.length() / tamanhoMaximo);
        String[] partes = new String[quantidadePartes];
   
        for (int i = 0; i < quantidadePartes; i++) {
            int inicio = i * tamanhoMaximo;
            int fim = Math.min(inicio + tamanhoMaximo, msg.length());
   
            partes[i] = msg.substring(inicio, fim);
        }
        
        return partes;
    }
}
