public class ParticipanteEnsino implements Participante {

    private Participante participante;
    private String tipoEnsino;
    private int semestres;
    private int pontos;

    public ParticipanteEnsino(Participante participante, String tipoEnsino, int semestres) {
        this.participante = participante;
        this.tipoEnsino = tipoEnsino;
        this.semestres = semestres;

        this.pontos = calcularPontos(tipoEnsino, semestres);
    }

    private int calcularPontos(String tipoEnsino, int semestres) {
        int limite;
        switch (tipoEnsino) {
            case "Federal":
                limite = 12;
                break;
            case "Superior":
                limite = 7;
                break;
            case "Medio":
                limite = 6;
                break;
            default:
                return 0;
        }
        return Math.min(semestres, limite);
    }

    @Override
    public String getNome() {
        return participante.getNome();
    }

    @Override
    public String getRg() {
        return participante.getRg();
    }

    @Override
    public int getPontuacao() {
        return participante.getPontuacao() + pontos;
    }
}