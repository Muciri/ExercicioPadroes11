public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        ArCondicionado arCondicionado = new ArCondicionado();
        DataShow dataShow = new DataShow();

        SensorPresenca sensorPresenca = new SensorPresenca();
        sensorPresenca.adicionarAparelho(lampada);
        sensorPresenca.adicionarAparelho(arCondicionado);
        sensorPresenca.adicionarAparelho(dataShow);

        System.out.println(sensorPresenca.getEstado());

        System.out.println("");
        sensorPresenca.entradaDocente("Alex");

        System.out.println("");
        sensorPresenca.entradaDocente("Petrônio");
        sensorPresenca.entradaDocente("Francisco");

        System.out.println("\nprofessores presentes:");
        System.out.println(sensorPresenca.getEstado());
        System.out.println("\n-=-=-=-=-=\n");

        sensorPresenca.entradaDocente("Fred");
        sensorPresenca.saidaDocente("Petrônio");

        System.out.println("\nprofessores presentes:");
        System.out.println(sensorPresenca.getEstado());
        System.out.println("\n-=-=-=-=-=\n");

        sensorPresenca.saidaDocente("Alex");
        sensorPresenca.saidaDocente("Francisco");
        sensorPresenca.saidaDocente("Fred");

        System.out.println(sensorPresenca.getEstado());
    }
}
