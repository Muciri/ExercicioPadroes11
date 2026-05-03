package decorator;

public class Caramelo extends CafeDecorator {
    public Caramelo(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com caramelo";
    }
    
    @Override
    public double getCusto() {
        return cafe.getCusto() + 5.0;
    }
}
