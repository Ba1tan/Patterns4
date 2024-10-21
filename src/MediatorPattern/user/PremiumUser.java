package MediatorPattern.user;


import MediatorPattern.mediator.ChatMediator;

public class PremiumUser extends User {

    public PremiumUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sends (Priority): " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " receives: " + message);
    }
}
