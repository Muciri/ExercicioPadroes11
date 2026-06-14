public class Stereo {
    public void on() {
        System.out.println("o Stereo foi ligado");
    }

    public void off() {
        System.out.println("o Stereo foi desligado");
    }

    public void setCD() {
        System.out.println("o CD foi inserido");
    }

    public void CDVD() {
        System.out.println("o DVD foi inserido");
    }

    public void setRadio() {
        System.out.println("o Radio foi inserido");
    }

    public void setVolume(int volume) {
        System.out.println("o Volume foi mudado para: " + volume);
    }
}
