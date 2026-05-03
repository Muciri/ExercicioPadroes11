package decorator;

public class Leite extends CafeDecorator {
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com leite";
    }
    
    @Override
    public double getCusto() {
        return cafe.getCusto() + 1.50;
    }
}
