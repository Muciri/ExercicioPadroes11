public class ArCondicionado implements Aparelho {
    public void ligarArCondicionado() {
        System.out.println("ar condicionado foi ligado");
    }

    public void desligarArCondicionado() {
        System.out.println("ar condicionado foi desligado");
    }

    @Override
    public void notificar(String acao) {
        if(acao.equals("ativo")) {
            ligarArCondicionado();
        } else {
            desligarArCondicionado();
        }
    }
}
