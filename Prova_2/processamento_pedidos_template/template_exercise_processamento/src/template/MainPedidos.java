package template;

import java.util.Scanner;

public class MainPedidos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite \"virtual\" para compra online ou \"fisico\" para compra na loja");
		String escolha = input.nextLine( );

	
		ProcessamentoDePedido compra;


		if(escolha.equals("fisico")) {
			System.out.println("Digite Dinheiro ou POS");
			String metodopagamento = input.nextLine();
			compra = new LojaFisica(metodopagamento);
		} else {
			System.out.println("Digite Dinheiro ou POS");
			String metodopagamento = input.nextLine( );
			compra = new LojaVirtual(metodopagamento);
		}

		compra.processarPedido("Xbox", true);
	}

}
