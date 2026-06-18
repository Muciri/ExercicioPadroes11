package enquete.view;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Window;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import enquete.model.EnqueteEvent;
import enquete.model.EnqueteListener;
import enquete.model.EnqueteSimples;

import java.awt.Frame;

public class TelaResultadoPercentual extends Window implements EnqueteListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map <String,Label>labels = new HashMap<String, Label>();


    public TelaResultadoPercentual(Frame parent){
        super(parent);
        this.setSize(220,120);
        this.setLayout(new GridLayout(0,2)); // Grid com qualquer numero
                                              // de linhas e uma coluna
        this.add(new Label("Percentual"));
        this.add(new Label());
    }
    
    /**
     * @see enquete.model.EnqueteListener#novaOpcao(EnqueteEvent)
     */
    public void novaOpcao(EnqueteEvent event) {
        String opcao = event.getOpcao();

        Label label;
        Label votos;
        if(!labels.containsKey(opcao)){
            label = new Label(opcao+" - ");
            votos = new Label(""+event.getVotos()+" %");
            labels.put(opcao,votos);
            this.add(label);
            this.add(votos);
        }
    }

    /**
     * @see enquete.model.EnqueteListener#novoVoto(EnqueteEvent)
     */
    public void novoVoto(EnqueteEvent event) {
        String opcao = event.getOpcao();

        Label votos;
        // Todos os labels tem que ser atualizados, e não só o que recebeu voto
        EnqueteSimples enquete = ((EnqueteSimples)event.getSource());
        		
        for( String item: enquete.getOpcoes() ) {
        	votos = labels.get(item);
        	int votosDaOpcao = enquete.getVotos(item);
        	int totalParcialVotos = enquete.getTotalVotos();
        	votos.setText(""+(votosDaOpcao*100/totalParcialVotos)+" %");
        	
        }
        		
        //votos.setText(""+(event.getVotos()*100/event.getTotalVotos())+" %");
    }
}
