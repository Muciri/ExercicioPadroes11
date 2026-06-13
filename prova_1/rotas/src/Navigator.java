public class Navigator {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy){
        this.strategy = strategy;
    }

    public String buildRoute(double pontoA, double pontoB){
        return strategy.buildRoute(pontoA, pontoB);
    }
}
