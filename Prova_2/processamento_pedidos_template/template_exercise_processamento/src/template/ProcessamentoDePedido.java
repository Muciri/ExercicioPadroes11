package template;

import java.util.Arrays;
import java.util.List;

public abstract class ProcessamentoDePedido {
	List<Produto> vitrine;
	
	public ProcessamentoDePedido() {
		vitrine = Arrays.asList(
				new Produto("Xbox", 1000),
				new Produto("Playstation", 5000),
				new Produto("PC", 10000)
		);
	}

	public void processarPedido(String nomeProduto, boolean querEmpacotar) {
		selecionarProduto(nomeProduto);
		
		pagar();
		
		if(querEmpacotar) {
			empacotar(nomeProduto);
		}
		
		entregar();
	}

	public void selecionarProduto(String nomeProduto) {
		for(Produto produto : vitrine) {
			if(produto.getDescricao().equals(nomeProduto)) {
				System.out.println("produto selecionado");
				return;
			}
		}
		System.out.println("produto nao selecionado");
	}

	public void empacotar(String nomeProduto) {
		System.out.println("empacotando " + nomeProduto);
	}

	public abstract void pagar();

	public abstract void entregar();
}
