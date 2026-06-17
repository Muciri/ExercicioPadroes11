import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaralhoUno implements Baralho {
    private List<Carta> deck;

    public BaralhoUno() {
        deck = new ArrayList<>();

        String[] cores = { "VERMELHO", "AZUL", "VERDE", "AMARELO" };

        // Cartas numéricas (20 de cada cor)
        for (String cor : cores) {

            // Carta 0 (1 unidade)
            deck.add(new Carta("0", cor, 0, Cor.valueOf(cor)));

            // Cartas 1 a 9 (2 unidades de cada)
            for (int numero = 1; numero <= 9; numero++) {
                deck.add(new Carta(String.valueOf(numero), cor, numero, Cor.valueOf(cor)));
                deck.add(new Carta(String.valueOf(numero), cor, numero, Cor.valueOf(cor)));
            }
        }

        // Comprar Duas (2 de cada cor)
        for (String cor : cores) {
            for (int i = 0; i < 2; i++) {
                deck.add(new Carta("COMPRE 2", cor, 20, Cor.valueOf(cor)));
            }
        }

        // Inverter (2 de cada cor)
        for (String cor : cores) {
            for (int i = 0; i < 2; i++) {
                deck.add(new Carta("INVERTER", cor, 20, Cor.valueOf(cor)));
            }
        }

        // Pular (2 de cada cor)
        for (String cor : cores) {
            for (int i = 0; i < 2; i++) {
                deck.add(new Carta("PULAR", cor, 20, Cor.valueOf(cor)));
            }
        }

        // Curinga (4 cartas)
        for (int i = 0; i < 4; i++) {
            deck.add(new Carta("CURINGA", "TODAS", 50, null));
        }

        // Comprar Quatro (4 cartas)
        for (int i = 0; i < 4; i++) {
            deck.add(new Carta("COMPRE 4", "TODAS", 50, null));
        }

        // Trocar as mãos (1 carta)
        deck.add(new Carta("TROCAR MAOS", "TODAS", 50, null));
    }

    @Override
    public boolean hasCard() {
        return !deck.isEmpty();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deck);
    }

    @Override
    public Carta dealCard() {
        if (hasCard()) {
            return deck.remove(deck.size() - 1);
        }
        return null;
    }

    @Override
    public int size() {
        return deck.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        int coluna = 0;
        for (Carta carta : deck) {
            sb.append(carta).append("   ");
            coluna++;

            if (coluna % 4 == 0) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}