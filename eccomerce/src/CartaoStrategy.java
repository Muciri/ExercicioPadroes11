import java.util.Scanner;

public class CartaoStrategy implements PagamentoStrategy{
    private boolean autenticado = false;

    public void coletarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero o cartao --> ");
        String numero = scanner.nextLine();

        System.out.println("digite a data");
        String data = scanner.nextLine();

        System.out.println("digite a o codigo de seguranca --> ");
        String codigo = scanner.nextLine();

        scanner.close();

        if (
            numero.equals("123") &&
            data.equals("16/06") &&
            codigo.equals("555")
        ) {
            this.autenticado = true;
        }
    }

    public String processarPagamento(int valorTotal) {
        if(autenticado) {
            return "pedido realizado pelo Cartão! valor total do pedido: " + valorTotal;
        }
        return "falha no pagamento";
    }
}
