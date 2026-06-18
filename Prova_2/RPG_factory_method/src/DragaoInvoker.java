public class DragaoInvoker extends Invoker{
    public DragaoInvoker() {
        super();
    }

    public DragaoInvoker(int mana) {
        super(mana);
    }

    @Override
    protected Criatura invocarCriatura() {
        return new Dragao();
    }
}
