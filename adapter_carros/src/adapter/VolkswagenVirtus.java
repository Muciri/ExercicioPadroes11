package adapter;

public class VolkswagenVirtus implements AutomovelBrasileiro{
    public double getVelocidadeKmh(boolean turbo) {
        double velocidade = 250;

        if(turbo) {
            velocidade = velocidade * 1.3;
        }

        return velocidade;
    }
}
