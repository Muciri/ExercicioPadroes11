public class RoadStrategy implements RouteStrategy{
    private double calcularTempo(double pontoA, double pontoB) {
        double resultado = pontoA - pontoB;
        if(resultado < 0) {
            resultado = resultado * -1;
        }

        return resultado;
    }

    public String buildRoute(double pontoA, double pontoB) {
        return "o caminho para a localização: " + pontoA + " - " + pontoB + " foi calculada para seguir de carro, levará: " + calcularTempo(pontoA, pontoB) + " Segundos";
    }
}
