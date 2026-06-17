public class Lampada implements Aparelho {
    public void ligarLampada() {
        System.out.println("lâmpada foi ligada");
    }

    public void desligarLampada() {
        System.out.println("lâmpada foi desligada");
    }

    @Override
    public void notificar(String acao) {
        if(acao.equals("ativo")) {
            ligarLampada();
        } else {
            desligarLampada();
        }
    }
}
