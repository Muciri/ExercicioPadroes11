public class Handler10Reais extends BaseHandler{
    @Override
    public void processar(int valor) {
        if(!verificarValorMultiploDe10(valor)) {
            System.out.println("ERRO: valor não é multiplo de 10");
            return;
        }

        int quantidadeNotas = valor/10;
        int resto = valor % 10;

        System.out.println("dispersando " + quantidadeNotas + " cedulas de 10 reais");

        if(resto != 0) {
            if(hasNext()) {
                next.processar(resto);
            } else {
                System.out.println("faltaram" + resto + "reais");
            }
        }
    }
}
