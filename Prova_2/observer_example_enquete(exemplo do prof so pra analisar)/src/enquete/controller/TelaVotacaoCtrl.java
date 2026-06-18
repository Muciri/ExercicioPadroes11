package enquete.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import enquete.model.EnqueteSimples;

public class TelaVotacaoCtrl implements ActionListener {

    private EnqueteSimples enquete;
    
    public TelaVotacaoCtrl(EnqueteSimples enquete){
        this.enquete = enquete;
    }

    /**
     * Evento lançado pelo clique nos botoes da TelaVotacao
     * @see java.awt.event.ActionListener#actionPerformed(ActionEvent)
     */
    public void actionPerformed(ActionEvent event) {
        enquete.votar(event.getActionCommand());
    }
}
