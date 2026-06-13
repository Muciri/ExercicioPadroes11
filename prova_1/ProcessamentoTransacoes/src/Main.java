import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        plataforma.setUsuarios(Arrays.asList("Murilo", "Isaac", "Eduardo", "Joel", "Arthur", "João"));

        // Teste com Cartão
        plataforma.setPagamento(new CartaoStrategy(plataforma));
        plataforma.transacao("Murilo", "Isaac", 15.0);
        System.out.println("-=-=-=-=-=");

        // Teste com Boleto
        plataforma.setPagamento(new BoletoStrategy(plataforma));
        plataforma.transacao("Eduardo", "Arthur", 20.0);
        System.out.println("-=-=-=-=-=");

        // Teste com Pix
        plataforma.setPagamento(new PixStrategy(plataforma));
        plataforma.transacao("Joel", "João", 25.0);
        System.out.println("-=-=-=-=-=");

        // Teste de falha 1
        System.out.println("teste de falha 1");
        plataforma.transacao("Joel", "fulano", 10);
        System.out.println("-=-=-=-=-=");

        // Teste de falha 2
        System.out.println("teste de falha 2");
        plataforma.transacao("Joel", "Murilo", -10);
    }
}