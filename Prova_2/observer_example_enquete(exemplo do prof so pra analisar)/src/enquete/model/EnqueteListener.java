package enquete.model;

public interface EnqueteListener {

    /**
     * Invocado quando um novo voto é contabilizado na Enquete.
     * @param event Evento gerado pela Enquete.
     */
    public void novoVoto(EnqueteEvent event);
    
    /**
     * Invocado quando uma nova opção é adicionada à Enquete.
     * @param event Evento gerado pela Enquete.
     */
    public void novaOpcao(EnqueteEvent event);
}
