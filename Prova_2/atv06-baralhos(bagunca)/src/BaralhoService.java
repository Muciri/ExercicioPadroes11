public abstract class BaralhoService {
    public void jogar() {
        Baralho baralho = criarBaralho();

        impressaoInicial(baralho);
        removerCartas(baralho);
        impressaoFinal(baralho);
    }

    protected void impressaoInicial(Baralho baralho) {
        System.out.println( "Size: " + baralho.size());
        System.out.println(baralho);
    }

    protected void removerCartas(Baralho baralho) {
        for ( int i = 0; i < 26; i++ )
        {
            System.out.printf( "%-20s\n", baralho.dealCard());
        }
    }

    protected void impressaoFinal(Baralho baralho) {
        System.out.println( "Size: " + baralho.size());
        System.out.println(baralho);
    }

    public abstract Baralho criarBaralho();
}
