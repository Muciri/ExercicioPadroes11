public class Main {
    public static void main(String[] args) {
        BebidaQuente cafe = new Cafe();
        cafe.prepararBebida();

        System.out.println("\n-=-=-=-=-=-=-=\n");

        BebidaQuente cha = new Cha();
        cha.prepararBebida();
    }
}
