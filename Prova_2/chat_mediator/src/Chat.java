import java.util.ArrayList;
import java.util.List;

public class Chat implements ChatMediator {
    private List<User> users;

    public Chat(){
        this.users=new ArrayList<>();
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void sendMessage(String msg, User user) {
        for(User userLoop : users) {
            if(userLoop != user) {
                userLoop.addMessage(msg);
            }
        }
    }
}