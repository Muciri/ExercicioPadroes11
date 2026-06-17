import java.util.List;

public interface Baralho {
    public boolean hasCard();
    public void shuffle();
    public Carta dealCard();
    public int size();
    public String toString();
}
