package template;

public class LojaFisica extends ProcessamentoDePedido {
    private String metodoPagamento;

    public LojaFisica(String metodoPagamento) {
        if(!metodoPagamento.equals("dinheiro") && !metodoPagamento.equals("POS")) {
            throw new RuntimeException("metodo indesejado");
        }

        this.metodoPagamento = metodoPagamento;
    }

    @Override
    public void pagar() {
        System.out.println("pagando via: " + metodoPagamento);
    }

    @Override
    public void entregar() {
        System.out.println("entregando pelo balcão");
    }
}
