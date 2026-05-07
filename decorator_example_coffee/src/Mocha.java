// Componente concreto
public class Mocha implements Cafe {
    private String descricao = "Mocha";
    private double custo = 20.0;

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getCusto() {
        return custo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
