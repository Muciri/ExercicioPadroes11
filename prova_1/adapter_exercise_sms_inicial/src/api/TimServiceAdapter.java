package api;

import model.SMS;

public class TimServiceAdapter implements SMSSender {
    private TimService timService;

    public TimServiceAdapter(TimService timService) {
        this.timService = timService;
    }
   
    public boolean sendSMS(SMS sms) {
        timService.sendSMS(sms);
        System.out.println("Mensagem enviada com sucesso para o número da operadora TIM");
       
        return true;
    }
}
