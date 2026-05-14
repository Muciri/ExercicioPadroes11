public class ParticipanteTitulado implements Participante{
    private Participante participante;
    private String titulo;
    private int ponto;

    public ParticipanteTitulado(Participante participante, String titulo) {
        this.participante = participante;
        this.titulo = titulo;
        this.ponto = calcularPontos(titulo);
    }

    private int calcularPontos(String titulo) {
        return switch(titulo) {
            case "doutor" -> 25;
            case "Meste" -> 18;
            case "Especialista" -> 10;
            default -> 0;
        };
    }

    public String getNome() {
        return titulo + " " + participante.getNome();
    }

    public String getRg() {
        return participante.getRg();
    }

    public int getPontuacao() {
        return participante.getPontuacao() + ponto;
    }
}
