import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;
    private List<String> clientesVip;

    public Loja() {
        this.produtos = new ArrayList<Produto>();
        this.clientesVip = new ArrayList<String>();
    }

    public Loja(ArrayList<Produto> produtos, ArrayList<String> clientesVip) {
        this.produtos = produtos;
        this.clientesVip = clientesVip;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<String> getClientesVip() {
        return clientesVip;
    }

    public void setClientesVip(List<String> clientesVip) {
        this.clientesVip = clientesVip;
    }

    public boolean hasProduto(Produto produto) {
        return this.produtos.contains(produto);
    }

    public boolean isClienteVip(String cliente) {
        return this.clientesVip.contains(cliente);
    }
}
