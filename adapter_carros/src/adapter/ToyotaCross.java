package adapter;

public class ToyotaCross implements AutomovelBrasileiro{
    public double getVelocidadeKmh(boolean turbo) {
        double velocidade = 200;

        if(turbo) {
            velocidade = velocidade * 1.3;
        }

        return velocidade;
    }
}
