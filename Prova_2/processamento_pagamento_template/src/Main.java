public class Main {
    public static void main(String[] args) {

        ProcessadorPagamento pix = new ProcessadorPix();
        ProcessadorPagamento cartao = new ProcessadorCartao();
        ProcessadorPagamento boleto = new ProcessadorBoleto();

        System.out.println("=== PIX ===");
        pix.processarPagamento(
                "murilo@pix.com",
                "Compra de teclado",
                250
        );

        System.out.println("\n=== CARTÃO ===");
        cartao.processarPagamento(
                "Murilo",
                "Compra de monitor",
                1200
        );

        System.out.println("\n=== CARTÃO (usuário inválido) ===");
        cartao.processarPagamento(
                "Joao",
                "Compra de mouse",
                80
        );

        System.out.println("\n=== BOLETO ===");
        boleto.processarPagamento(
                "Gabriel",
                "Mensalidade",
                500
        );
    }
}