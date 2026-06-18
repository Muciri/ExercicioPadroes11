package enquete.model;

import java.util.EventObject;
import java.util.Set;

public class EnqueteEvent extends EventObject {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String opcao = null;
    //private int votos = 0;
    
    public EnqueteEvent(EnqueteSimples source){
        super(source);
    }
    public EnqueteEvent(EnqueteSimples source,String opcao){
        this(source);
        this.opcao = opcao;
    }
    
    public EnqueteSimples getEnquete() {
    	return (EnqueteSimples) this.source;
    }

    /**
     * Retorna a opção associada ao evento gerado.
     * A opção pode ser uma nova opção adicionada à EnqueteSimples
     * ou a opção escolhida para adicionar um novo voto.
     * @return String opção
     */
    public String getOpcao() {
        return opcao;
    }


    /**
     * Retorna o numero de votos da opcao
     * @return int votos
     */
    public int getVotos() {
        return ((EnqueteSimples)this.source).getVotos(opcao);
    }
    
    /**
     * Retorna o total de votos da enquete
     * @return int
     */
    public int getTotalVotos() {
        return ((EnqueteSimples)this.source).getTotalVotos();
    }
    
    
}
