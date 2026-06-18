public class FenixInvoker extends Invoker{
    public FenixInvoker() {
        super();
    }

    public FenixInvoker(int mana) {
        super(mana);
    }

    @Override
    public Criatura invocarCriatura(){
        return new Fenix();
    }
}
