package adapter;

public class AutomovelBrasileiroAdapter implements Vehicle{
    private AutomovelBrasileiro automovelBrasileiro;
    private boolean hasTurbo;

    public AutomovelBrasileiroAdapter(AutomovelBrasileiro automovelBrasileiro) {
        this.automovelBrasileiro = automovelBrasileiro;
        this.hasTurbo = false;
    }

    public AutomovelBrasileiroAdapter(AutomovelBrasileiro automovelBrasileiro, boolean hasTurbo) {
        this.automovelBrasileiro = automovelBrasileiro;
        this.hasTurbo = hasTurbo;
    }
    
    public double getSpeed() {
        return automovelBrasileiro.getVelocidadeKmh(hasTurbo);
    }
}
