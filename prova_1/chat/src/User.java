import java.util.ArrayList;

public class User implements UserInterface{
    protected String name;
    protected ArrayList<Message> messages = new ArrayList<Message>();
    
    public User(String name){
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        User usuario = (User) obj;
        return this.name.equals(usuario.name);
    }

    public void receberMensagem(Message mensagem) {
        this.messages.add(mensagem);
    }

    public void exibirMensagens() {
        if (messages.isEmpty()) {
            System.out.println(name + " não tem mensagens.");
            return;
        }

        System.out.println("Mensagens de " + name + ":");

        for (Message msg : messages) {
            System.out.println(msg);
        }
    }


}