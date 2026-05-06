public class Main {
    public static void main(String[] args) {
        Preparacao preparacao = new Preparacao();
        Loja loja = new Loja(preparacao);

        System.out.println(loja.informar());
        loja.avancar();
        System.out.println("-=-=-=-=-=-=-=-");

        System.out.println(loja.informar());
        loja.avancar();
        System.out.println("-=-=-=-=-=-=-=-");

        System.out.println("produto com defeito...");
        System.out.println(loja.informar());
        loja.devolver();
        loja.avancar();
        System.out.println("-=-=-=-=-=-=-=-");

        System.out.println(loja.informar());
        loja.avancar();
        System.out.println("-=-=-=-=-=-=-=-");

        System.out.println(loja.informar());
        loja.avancar();
        System.out.println("-=-=-=-=-=-=-=-");

        System.out.println(loja.informar());
        loja.avancar();
        System.out.println("-=-=-=-=-=-=-=-");
    }
}