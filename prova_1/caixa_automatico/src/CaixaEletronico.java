public class CaixaEletronico {
    public static void main(String[] args) {
        DispersadorHandler handler50Reais = new Handler50Reais();
        DispersadorHandler handler20Reais = new Handler20Reais();
        DispersadorHandler handler10Reais = new Handler10Reais();

        handler50Reais.setNext(handler20Reais);
        handler20Reais.setNext(handler10Reais);

        handler50Reais.processar(230);
    }
}
