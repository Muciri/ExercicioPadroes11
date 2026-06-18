package locadora.extrato;

import java.util.Iterator;

import locadora.cliente.Locacao;

public abstract class GeradorExtrato {
    public String gerarExtrato(String nome, double valorTotal, int PontosTotaisDeAlugadorFrequente, Iterator<Locacao> locacoes) {
        String resultado = "";

        resultado += adicionaCabecalho(nome);

        resultado += adicionaCorpo(locacoes);

        resultado += adicionaRodape(valorTotal, PontosTotaisDeAlugadorFrequente);

        return resultado;
    }

    protected abstract String adicionaCabecalho(String nome);

    protected abstract String adicionaCorpo(Iterator<Locacao> locacoes);

    protected abstract String adicionaRodape(double valorTotal, int PontosTotaisDeAlugadorFrequente);
}
