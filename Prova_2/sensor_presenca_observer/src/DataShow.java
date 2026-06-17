public class DataShow implements Aparelho{
    public void ligarDataShow() {
        System.out.println("DataShow foi ligado");
    }

    public void desligarDataShow() {
        System.out.println("DataShow foi desligado");
    }

    @Override
    public void notificar(String acao) {
        if(acao.equals("ativo")) {
            ligarDataShow();
        } else {
            desligarDataShow();
        }
    }
}
