public class StereoSetVolumeCommand implements Command{
    private Stereo stereo;
    private int volume;

    public StereoSetVolumeCommand(Stereo stereo, int volume) {
        this.stereo = stereo;
        this.volume = volume;
    }

    @Override
    public void execute() {
        stereo.setVolume(volume);
    }
}
