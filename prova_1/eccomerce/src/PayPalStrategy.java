import java.util.Scanner;

public class PayPalStrategy implements PagamentoStrategy{
    private boolean autenticado = false;
    
    public void coletarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero o email --> ");
        String email = scanner.nextLine();

        System.out.println("digite a senha --> ");
        String senha = scanner.nextLine();

        scanner.close();

        if (
            email.equals("murilo@email") &&
            senha.equals("1234")
        ) {
            this.autenticado = true;
        }
    }

    public String processarPagamento(int valorTotal) {
        if(autenticado) {
            return "pedido realizado pelo Paypal! valor total do pedido: " + valorTotal;
        }
        return "falha no pagamento";
    }
}
