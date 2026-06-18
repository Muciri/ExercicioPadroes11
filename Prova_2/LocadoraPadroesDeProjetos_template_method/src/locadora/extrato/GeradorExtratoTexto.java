package locadora.extrato;

import java.util.Iterator;

import locadora.cliente.Locacao;

public class GeradorExtratoTexto extends GeradorExtrato {
	@Override
	protected String adicionaCabecalho(String nome) {
		final String fimDeLinha = System.getProperty("line.separator");

		String cabecalho = "Registro de Locações de " + nome + fimDeLinha;
		cabecalho += String.format("Seq Automovel             Ano  Diarias   Valor Pago"+fimDeLinha);
		cabecalho += String.format("=== ==================== ===== ========= ==========="+fimDeLinha);

		return cabecalho;
	}

	@Override
	protected String adicionaCorpo(Iterator<Locacao> locacoes) {
		final String fimDeLinha = System.getProperty("line.separator");
		
		int sequencia = 0;
		String corpo = "";
		
		while(locacoes.hasNext()) {
			Locacao cada = locacoes.next();

			// mostra valores para esta locação
			sequencia++;
			corpo += String.format("%02d. %-20s  %4d    %2d     R$ %8.2f"+fimDeLinha,sequencia, cada.getCarro().getDescricao(),cada.getCarro().getAno(), cada.getDiasAlugado(), cada.valorDeUmaLocacao() );
		} // while

		return corpo;
	}

	@Override
	protected String adicionaRodape(double valorTotal, int PontosTotaisDeAlugadorFrequente) {
		final String fimDeLinha = System.getProperty("line.separator");
		
		String rodape = "====================================================" + fimDeLinha;
		rodape += String.format("Valor Acumulado em diárias............:  R$ %8.2f" + fimDeLinha, valorTotal);
		rodape += "Voce acumulou " + PontosTotaisDeAlugadorFrequente +
              " pontos de locador frequente";

		return rodape;
	}
}
