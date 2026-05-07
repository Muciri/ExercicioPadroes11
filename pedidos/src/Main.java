import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("placa de video", 5000);
        Produto produto2 = new Produto("processador", 1800);
        Produto produto3 = new Produto("memoria RAM 16GB", 450);
        Produto produto4 = new Produto("SSD 1TB", 600);
        Produto produto5 = new Produto("placa mãe", 1200);
        Produto produto6 = new Produto("fonte 650W", 400);
        Produto produto7 = new Produto("gabinete gamer", 350);

        ArrayList<Produto> produtos = new ArrayList<>(List.of(
                produto1, produto2, produto3, produto4, produto5, produto6, produto7
        ));

        ArrayList<String> ClientesVip = new ArrayList<>(List.of("Murilo", "Joel"));

        Loja loja = new Loja(produtos, ClientesVip);

        VerificacaoEstoqueHandler verificadorEstoque = new VerificacaoEstoqueHandler(loja);
        CalculoFreteHandler calculadoraFrete = new CalculoFreteHandler();
        AplicadorDesconto aplicadorDesconto = new AplicadorDesconto(loja);
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();

        verificadorEstoque.setNext(calculadoraFrete);
        calculadoraFrete.setNext(aplicadorDesconto);
        aplicadorDesconto.setNext(processadorPagamento);

        ArrayList<Produto> produtos1 = new ArrayList<>(List.of(produto1, produto2));
        Pedido pedido1 = new Pedido(produtos1, "Felipe");

        ArrayList<Produto> produtos2 = new ArrayList<>(List.of(produto1, produto3, produto4));
        Pedido pedido2 = new Pedido(produtos2, "Murilo");

        verificadorEstoque.processar(pedido1);
        verificadorEstoque.processar(pedido2);

        System.out.println("preço do pedido 1: " + pedido1.getValorDoPedido());
        System.out.println("preço do pedido 2: " + pedido2.getValorDoPedido());

        System.out.println(pedido1);
        System.out.println(pedido2);
    }
}
