public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();

        User user1 = new User("Murilo", chat);
        User user2 = new User("Gabriel", chat);
        User user3 = new User("Felipe", chat);
        User user4 = new User("Francisco", chat);

        user1.sendMessage("olá");
        user2.sendMessage("eae?");
        user3.sendMessage("tudo ótimo");

        System.out.println("user 1");
        System.out.println(user1.printMessages());

        System.out.println("user 4");
        System.out.println(user4.printMessages());
    }
}
