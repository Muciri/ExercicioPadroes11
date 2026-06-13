package decorator;

public class Chantilly extends CafeDecorator {
    public Chantilly(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com chantily";
    }

    @Override
    public double getCusto() {
        return cafe.getCusto() + 3.0;
    }
}
