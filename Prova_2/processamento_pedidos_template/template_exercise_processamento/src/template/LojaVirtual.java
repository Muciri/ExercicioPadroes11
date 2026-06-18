package template;

public class LojaVirtual extends ProcessamentoDePedido {
    private String metodoPagamento;

    public LojaVirtual(String metodoPagamento) {
        if(!metodoPagamento.equals("cartão") && !metodoPagamento.equals("paypal") && !metodoPagamento.equals("pix")) {
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
        System.out.println("entregando pelo caminhão");
    }
}
