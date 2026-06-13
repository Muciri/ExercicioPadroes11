import java.util.Scanner;

public class MainEcommerce {
    public static void main(String[] args) {
        String[] carrinho = {"pc gamer", "celular", "teclado"};
        int valorTotal = 5000;

        Pedido pedido = new Pedido(valorTotal);

        Scanner scanner = new Scanner(System.in);
        System.out.println("deseja fazer o pagamento por cartão ou paypal?");
        String metodo = scanner.nextLine();

        if(metodo.equals("cartao")) {
            pedido.setMetodoPagamento(new CartaoStrategy());
        }
        else if (metodo.equals("paypal")) {
            pedido.setMetodoPagamento(new PayPalStrategy());
        }
        else {
            pedido.setMetodoPagamento(new CartaoStrategy());
        }

        System.out.println(pedido.pagar());
    }
}