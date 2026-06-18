public class IronGolenInvoker extends Invoker {
    public IronGolenInvoker() {
        super();
    }

    public IronGolenInvoker(int mana) {
        super(mana);
    }

    @Override
    protected Criatura invocarCriatura(){
        return new IronGolen();
    }
}
