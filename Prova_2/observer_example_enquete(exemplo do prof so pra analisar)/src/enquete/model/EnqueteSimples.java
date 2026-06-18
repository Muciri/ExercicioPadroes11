package enquete.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EnqueteSimples {
    private Map <String,Integer>opcoes = null;
    private List <EnqueteListener>enqueteListeners = new LinkedList<EnqueteListener>();
    
    public EnqueteSimples(){
    	// Opcoes a serem votadas na enquete e a quantidade de votos
        opcoes = new HashMap<String, Integer>();
    }
    
    /**
     * Adiciona uma opção para ser votada na enquete
     * @param opcao nome da opção
     */

	public void addOpcao(String opcao){
        opcoes.put(opcao, Integer.valueOf(0));
        this.disparaNovaOpcao(opcao);
    }
    
    /**
     * Retorna um iterador de opções disponíveis na enquete
     * @return Iterator opções disponiveis na enquete
     */
    public Set <String> getOpcoes(){
        return opcoes.keySet();
    }
    
    /**
     * Incrementa um voto para opção
     * @param opcao opção que receberá voto
     */
    public void votar(String opcao){
        int votoAtual = ((Integer)opcoes.get(opcao)).intValue();
        opcoes.put(opcao, Integer.valueOf(++votoAtual));
        this.disparaNovoVoto(opcao);
    }
    
    /**
     * Retorna a soma dos votos de todas as opções da enquete
     * @return int soma dos votos de todas as opções da enquete
     */
    public int getTotalVotos(){
        
        int total = 0;
        for(Integer votos : opcoes.values()){
            total+= votos.intValue();
        }
        return total;
    }
    
    /**
     * Retorna a quantidade de votos de uma opção individual
     * @param opcao opção que se quer o voto
     * @return int quantidade de votos da opção
     */
    public int getVotos(String opcao){
        return (opcoes.get(opcao)).intValue();
    }
    
    /**
     * Adiciona um EnqueteListener, um objeto interessado em
     * receber eventos lançados pela Enquete
     * @see EnqueteListener
     * @param listener objeto interessado em receber eventos
     */
    public synchronized void addEnqueteListener(EnqueteListener listener){
        if(enqueteListeners.contains(listener)){ return; }
        this.enqueteListeners.add(listener);
    }
    
    /**
     * Informa aos objetos interessados nos eventos lançados
     * pela Enquete que um novo voto foi contabilizado.
     */
    private synchronized void disparaNovoVoto(String opcao){
        for(EnqueteListener listeners : this.enqueteListeners){
            listeners.novoVoto(new EnqueteEvent(this,opcao));
        }
    }
    
    /**
     * Informa aos objetos interessados nos enventos lançados
     * pela Enquete que uma nova opção foi adicionada.
     */
    private synchronized void disparaNovaOpcao(String opcao){
        
        for(EnqueteListener listeners : this.enqueteListeners){
            listeners.novaOpcao(new EnqueteEvent(this,opcao));
        }
    }

}
