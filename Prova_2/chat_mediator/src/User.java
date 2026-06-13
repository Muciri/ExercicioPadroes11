import java.util.ArrayList;
import java.util.List;

public class User {
    protected String name;
    protected ChatMediator chatMediator;
    protected List<String> messages;

    public User(String name){
        this.name=name;
        this.messages = new ArrayList<String>();
    }

    public User(String name, ChatMediator chatMediator){
        this.name=name;
        this.messages = new ArrayList<String>();
        this.chatMediator = chatMediator;
        chatMediator.addUser(this);
    }

    public void setChatMediator(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String msg) {
        chatMediator.sendMessage(msg, this);
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public String printMessages() {
        return messages.toString();
    }
}