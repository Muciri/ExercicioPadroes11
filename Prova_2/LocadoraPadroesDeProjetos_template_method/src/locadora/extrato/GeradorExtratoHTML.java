package locadora.extrato;

import java.util.Iterator;

import locadora.cliente.Locacao;

public class GeradorExtratoHTML extends GeradorExtrato{
	@Override
	protected String adicionaCabecalho(String nome) {
		final String fimDeLinha = System.getProperty("line.separator");
		
		String cabecalho = "<html><body>"+ fimDeLinha;
		cabecalho = String.format("<H2>Registro de Locacoes de <EM> %s </EM></H2>", nome) + fimDeLinha;
		cabecalho += "<table border=\"1\"><tr><th>Seq</th><th>Automóvel</th><th>Ano</th><th>Diárias</th><th>Valor</th></tr>" + fimDeLinha;

		return cabecalho;
	}

	@Override
	protected String adicionaCorpo(Iterator<Locacao> locacoes) {
		final String fimDeLinha = System.getProperty("line.separator");
		
		int sequencia = 0;
		String corpo = "";
		while(locacoes.hasNext()) {
			Locacao cada = locacoes.next();
			// mostra valores para este Locacao
			sequencia++;
			corpo +=
			String.format("<tr><th>%02d.</th><th>%s</th><th>%4d</th><th>%2d</th><th>R$ %8.2f</th></tr>" + fimDeLinha, sequencia,
			cada.getCarro().getDescricao(),cada.getCarro().getAno(),
			cada.getDiasAlugado(), cada.valorDeUmaLocacao() );
		} // while

		return corpo;
	}

	@Override
	protected String adicionaRodape(double valorTotal, int PontosTotaisDeAlugadorFrequente) {
		final String fimDeLinha = System.getProperty("line.separator");
		
		String rodape = String.format("<tfoot><tr><td colspan=\"4\">Valor Acumulado em diárias:</td><td><EM>R$ %8.2f</EM></td></tr></tfoot></table>" + fimDeLinha, valorTotal);
		rodape += "<P>Voce acumulou <EM>" + PontosTotaisDeAlugadorFrequente + " pontos </EM> de alugador frequente</p></body></html> ";
		return rodape;
	}
}
