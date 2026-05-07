// Componente concreto
public class CafeSimples implements Cafe {
    private String descricao = "Café simples";
    private double custo = 4.0;

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
