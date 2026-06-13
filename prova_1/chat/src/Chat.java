import java.util.List;
import java.util.ArrayList;

public class Chat {
    private List<UserInterface> users;
    
    public Chat(){
        this.users =new ArrayList<>();
    }

    public void addUser(UserInterface user){
        this.users.add(user);
    }

    public void sendMessage(String msg, User user) {
        for(UserInterface userArray: users) {
            if (!userArray.equals(user)) {
                Message mensagem = new Message(user, msg);
                userArray.receberMensagem(mensagem);
            }
        }
    }
}
