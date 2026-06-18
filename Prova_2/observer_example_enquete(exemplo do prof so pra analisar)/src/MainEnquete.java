import enquete.controller.TelaVotacaoCtrl;
import enquete.model.EnqueteSimples;
import enquete.view.TelaResultado;
import enquete.view.TelaResultadoPercentual;
import enquete.view.TelaVotacao;

public class MainEnquete {

    public static void main(String[] args) {

        // Modelo
        EnqueteSimples enquete= new EnqueteSimples();


        // Controlador da Interface "TelaVotacao"
        TelaVotacaoCtrl ctrl = new TelaVotacaoCtrl(enquete);

        // Interface que altera o estado do modelo
        TelaVotacao votacao = new TelaVotacao(ctrl);
        votacao.setLocation(5,5);
        
        // Interface que exibe o resultado absoluto da votacao
        TelaResultado resultado = new TelaResultado(votacao);
        resultado.setLocation(320,5);

        // Interface que exibe o resultado percentual da votacao
        TelaResultadoPercentual resultadoPerc = 
                                new TelaResultadoPercentual(votacao);
        resultadoPerc.setLocation(450,5);
        
        // Adicionando as interfaces interessadas na mudança do
        // estado do modelo
        enquete.addEnqueteListener(votacao);
        enquete.addEnqueteListener(resultado);
        enquete.addEnqueteListener(resultadoPerc);

        // Povoando o modelo
        enquete.addOpcao("Iterator");
        enquete.addOpcao("Observer");
        enquete.addOpcao("Abstract Factory");
        enquete.addOpcao("Template Method");


        // Exibindo as interfaces
        votacao.show();
        resultado.show();
        resultadoPerc.show();
    }
}
