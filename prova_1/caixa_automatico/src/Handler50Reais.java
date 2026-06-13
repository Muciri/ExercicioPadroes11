public class Handler50Reais extends BaseHandler{
    @Override
    public void processar(int valor) {
        if(!verificarValorMultiploDe10(valor)) {
            System.out.println("ERRO: valor não é multiplo de 10");
            return;
        }

        int quantidadeNotas = valor/50;
        int resto = valor % 50;

        System.out.println("dispersando " + quantidadeNotas + " cedulas de 50 reais");

        if(resto != 0) {
            if(hasNext()) {
                next.processar(resto);
            } else {
                System.out.println("faltaram" + resto + "reais");
            }
        }
    }
}
