public class Handler20Reais extends BaseHandler{
    @Override
    public void processar(int valor) {
        if(!verificarValorMultiploDe10(valor)) {
            System.out.println("ERRO: valor não é multiplo de 10");
            return;
        }

        int quantidadeNotas = valor/20;
        int resto = valor % 20;

        System.out.println("dispersando " + quantidadeNotas + " cedulas de 20 reais");

        if(resto != 0) {
            if(hasNext()) {
                next.processar(resto);
            } else {
                System.out.println("faltaram" + resto + "reais");
            }
        }
    }
}
