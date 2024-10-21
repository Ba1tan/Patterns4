package MediatorPattern.mediator;


import MediatorPattern.user.User;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
