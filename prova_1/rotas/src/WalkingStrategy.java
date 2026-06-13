public class WalkingStrategy implements RouteStrategy{
    private double calcularTempo(double pontoA, double pontoB) {
        double resultado = pontoA * pontoB;
        if(resultado < 0) {
            resultado = resultado * -1;
        }

        return resultado;
    }

    public String buildRoute(double pontoA, double pontoB) {
        return "o caminho para a localização: " + pontoA + " - " + pontoB + " foi calculada para seguir a pé, levará: " + calcularTempo(pontoA, pontoB) + " Segundos";
    }
}
