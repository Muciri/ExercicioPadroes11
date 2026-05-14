public class ParticipanteExperiencia implements Participante{
    private Participante participante;
    private String experiencia;
    private int ponto;

    public ParticipanteExperiencia(Participante participante, String experiencia) {
        this.participante = participante;
        this.experiencia = experiencia;
        this.ponto = calcularPontos(experiencia);
    }

    private int calcularPontos(String experiencia) {
        return switch(experiencia) {
            case "direcao" -> 15;
            case "coordenacao" -> 10;
            default -> 0;
        };
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
