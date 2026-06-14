public class RemoteControl {
    private Command button;

    public RemoteControl() {}

    public void setCommand(Command command) {
        this.button = command;
    }

    public void buttonWasPressed() {
        button.execute();
    }
}
