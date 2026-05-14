public class ParticipanteAvaliado implements Participante{
    private Participante participante;
    private int ponto;

    public ParticipanteAvaliado(Participante participante, int ponto) {
        this.participante = participante;
        this.ponto = ponto;
    }

    public String getNome() {
        return participante.getNome();
    }

    public String getRg() {
        return participante.getRg();
    }

    public int getPontuacao() {
        return participante.getPontuacao() + ponto;
    }
}
