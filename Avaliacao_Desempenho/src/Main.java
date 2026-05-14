import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int vagas = 2;
        List<Participante> classificados = new ArrayList<>();

        //CANDIDATO 1 Aprovado na didática
        double notaDidatica1 = 82;

        if (notaDidatica1 >= 70) {
            Participante c1 = new Candidato("111111", "João Silva");
            // Nota da prova didática
            c1 = new ParticipanteAvaliado(c1, (int) notaDidatica1);
            // Titulação
            c1 = new ParticipanteTitulado(c1, "doutor");
            // Ensino
            c1 = new ParticipanteEnsino(c1, "Federal", 10);
            // Gestão acadêmica
            c1 = new ParticipanteExperiencia(c1, "direcao");

            classificados.add(c1);
        }

        // CANDIDATO 2 Aprovado na didática
        double notaDidatica2 = 75;
        if (notaDidatica2 >= 70) {
            Participante c2 = new Candidato("222222", "Maria Souza");
            c2 = new ParticipanteAvaliado(c2, (int) notaDidatica2);
            c2 = new ParticipanteTitulado(c2, "Especialista");
            c2 = new ParticipanteEnsino(c2, "Superior", 5);
            c2 = new ParticipanteExperiencia(c2, "coordenacao");

            classificados.add(c2);
        }

        // CANDIDATO 3  Reprovado na didática

        double notaDidatica3 = 60;

        if (notaDidatica3 >= 70) {
            Participante c3 = new Candidato("333333", "Carlos Lima");
            c3 = new ParticipanteAvaliado(c3, (int) notaDidatica3);
            c3 = new ParticipanteTitulado(c3, "Mestre");
            c3 = new ParticipanteEnsino(c3, "Medio", 6);

            classificados.add(c3);

        } else {
            System.out.println("Candidato Carlos Lima eliminado na prova didática.");
        }

        // ORDENAÇÃO DA CLASSIFICAÇÃO

        classificados.sort(Comparator.comparingInt(Participante::getPontuacao).reversed());

        // RESULTADO FINAL

        System.out.println("\n===== CLASSIFICAÇÃO FINAL =====");

        for (int i = 0; i < classificados.size(); i++) {
            Participante p = classificados.get(i);
            System.out.println(
                    (i + 1) + "º Lugar -> " +
                            p.getNome() +
                            " | RG: " + p.getRg() +
                            " | Pontuação Final: " + p.getPontuacao()
            );
        }

        // APROVADOS DENTRO DAS VAGAS
        System.out.println("\n===== APROVADOS =====");
        for (int i = 0; i < vagas && i < classificados.size(); i++) {
            Participante p = classificados.get(i);
            System.out.println(
                    p.getNome() +
                            " aprovado(a) com " +
                            p.getPontuacao() + " pontos."
            );
        }
    }
}