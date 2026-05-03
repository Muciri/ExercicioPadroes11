package decorator;

public class CafeExpresso implements Cafe {
    @Override
    public String getDescricao() {
        return "Cafe expresso";
    }

    @Override
    public double getCusto() {
        return 5.5;
    }
}