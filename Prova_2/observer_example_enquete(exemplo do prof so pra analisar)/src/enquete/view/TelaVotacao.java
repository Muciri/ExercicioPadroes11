package enquete.view;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JLabel;

import enquete.model.EnqueteEvent;
import enquete.model.EnqueteListener;

import java.awt.Frame;

public class TelaVotacao extends Frame implements EnqueteListener {


	private static final long serialVersionUID = 1L;

	private Collection <String>botoes = new ArrayList<String>();
    
    
    private ActionListener controller;

    public TelaVotacao(ActionListener controller){
        super("Tela de Votação - Enquete");
        this.setSize(300,200);
        this.setLayout(new GridLayout(0,1)); // Grid com qualquer numero
                                              // de linhas e uma coluna
        JLabel label = new JLabel("Qual dos padrões você mais gostou?");
        this.add(label);
        
        this.controller = controller;
        this.addWindowListener(new WindowAdapter() {
            @SuppressWarnings("deprecation")
			public void windowClosing(WindowEvent e) {
                e.getWindow().hide();
                System.exit(0);
            }
        });
    }

    /**
     * @see enquete.model.EnqueteListener#novaOpcao(EnqueteEvent)
     */
    public void novaOpcao(EnqueteEvent event) {
        String opcao = event.getOpcao();
        Button botao;

        if(!botoes.contains(opcao)){
            botoes.add(opcao);
            botao = new Button(opcao);
            botao.setActionCommand(opcao);
            botao.addActionListener(controller);
            this.add(botao);
        }
    }

    /**
     * @see enquete.model.EnqueteListener#novoVoto(EnqueteEvent)
     */
    public void novoVoto(EnqueteEvent event) {
        // Nothing to do
    }

}
