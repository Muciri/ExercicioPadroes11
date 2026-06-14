public class Main {
    public static void main(String[] args) {
        CanalDeNoticias canal = new CanalDeNoticias();

        Assinante murilo = new Assinante("Murilo");
        Assinante gabriel = new Assinante("Gabriel");
        Assinante francisco = new Assinante("Francisco");
        Assinante rogerio = new Assinante("Rogerio");
        Assinante felipe = new Assinante("Felipe");

        canal.adicionarObservador(murilo);
        canal.adicionarObservador(gabriel);
        canal.adicionarObservador(felipe);

        System.out.println("notícia 1");
        canal.atualizarObservaddores("Brasil ganhou o hexa!");


        System.out.println("\n-=-=-=-=-=-=-=-=\n");
        canal.removerObservador(felipe);

        canal.adicionarObservador(francisco);
        canal.adicionarObservador(rogerio);

        canal.atualizarObservaddores("lançou o GTA 6");
    }
}
