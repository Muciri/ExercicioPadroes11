// Classe Card representa uma carta de baralho.

public class Carta 
{
   private String face; // face da carta ("Ace", "Deuce", ...)
   private String naipe; // naipe da carta ("Hearts", "Diamonds", ...)
   private Cor cor;
   private int valor;

   // construtor de dois argumentos inicializa face e naipe da carta
   public Carta( String face, String naipe, int valor )
   {
	   this(face, naipe, valor, Cor.PRETO);
   } // fim do construtor Card de dois argumentos
   
   // construtor de dois argumentos inicializa face e naipe da carta
   public Carta( String face, String naipe, int valor, Cor cor )
   {
      this.face = face; // inicializa face da carta
      this.naipe = naipe; // inicializa naipe da carta
      this.valor = valor;
      this.cor = cor;
   } // fim do construtor Card de dois argumentos


   public String getFace() {
	  return face;
   }

   public int getValor() {
	   return valor;
   }
   
   public Cor getCor() {
	   return cor;
   }


   public String getNaipe() {
	  return naipe;
   }

   public void setValue(int value) {
      this.valor = value;
   }
   
   // retorna representa��o String de Card
   @Override
   public String toString()
   {
      // Se a cor for nula, usa o código ANSI de RESET (evita o NullPointerException)
      String codigoCor = (this.cor != null) ? this.cor.ansiCode() : Cor.RESET.ansiCode();

      return String.format("%6s", face) + " de " + codigoCor + naipe + Cor.RESET.ansiCode() + ", valor " + valor;
   } // fim do método toString
   

} // fim da classe Card


