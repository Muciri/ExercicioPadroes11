public class MainBaralho
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      BaralhoPlayer player = new BaralhoPlayer();

      System.out.println("BARALHO TRADICIONAL");
      System.out.println("===================");
      player.setBaralhoService(new BaralhoTradicionalService());
      player.jogar();

      System.out.println("\nBARALHO UNO");
      System.out.println("===================");
      player.setBaralhoService(new BaralhoUnoService());
      player.jogar();
      
   } // fim de main
} // fim da classe DeckOfCardsTest


