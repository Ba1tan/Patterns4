import MediatorPattern.mediator.ChatMediator;
import MediatorPattern.mediator.ChatRoom;
import MediatorPattern.user.PremiumUser;
import MediatorPattern.user.RegularUser;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        RegularUser user1 = new RegularUser(chatRoom, "Alice");
        RegularUser user2 = new RegularUser(chatRoom, "Bob");
        PremiumUser user3 = new PremiumUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello, everyone!");
        user3.sendMessage("Hi, Alice!");
    }
}
