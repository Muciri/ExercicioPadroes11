public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();

        User Murilo = new User("Murilo");
        User Gabriel = new User("Gabriel");
        User Francisco = new User("Francisco");
        User Felipe = new User("Felipe");
        User Rogerio = new User("Rogerio");

        chat.addUser(Murilo);
        chat.addUser(Gabriel);
        chat.addUser(Francisco);
        chat.addUser(Felipe);
        chat.addUser(Rogerio);

        chat.sendMessage("galera a apresentação é amanhã", Murilo);
        chat.sendMessage("é nada", Felipe);
        chat.sendMessage("que?", Gabriel);
        chat.sendMessage("eita pega", Felipe);
        chat.sendMessage("vai tomar no cu", Rogerio);


        Murilo.exibirMensagens();
        System.out.println("\n-=-=-=\n");
        Rogerio.exibirMensagens();
    }
}
