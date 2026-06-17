public class BaralhoPlayer {
    private BaralhoService baralhoService;

    public BaralhoPlayer() {}

    public void setBaralhoService(BaralhoService baralhoService) {
        this.baralhoService = baralhoService;
    }

    public void jogar() {
        baralhoService.jogar();
    }
}
