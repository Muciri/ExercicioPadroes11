public class Main {
    public static void main(String[] args) {
        RemoteControl controle = new RemoteControl();

        // Teste 1
        System.out.println("teste 1");

        Light luz = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(luz);
        LightOffCommand lightOffCommand = new LightOffCommand(luz);

        controle.setCommand(lightOnCommand);
        controle.buttonWasPressed();

        controle.setCommand(lightOffCommand);
        controle.buttonWasPressed();


        // Teste 2
        System.out.println("\nteste 2");

        Stereo stereo = new Stereo();

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        StereoSetVolumeCommand stereoSetVolumeCommand = new StereoSetVolumeCommand(stereo, 50);

        controle.setCommand(stereoOnCommand);
        controle.buttonWasPressed();

        controle.setCommand(stereoSetVolumeCommand);
        controle.buttonWasPressed();

        controle.setCommand(stereoOffCommand);
        controle.buttonWasPressed();
    }
}
