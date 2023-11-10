// package Assign8;
import java.util.*;

interface MessengerInterface{
    void registerSubscriber(User user);
    void removeSubscriber(User user);
    void notify(String message);
}
interface SubscriberInterface{
    void receive(String message);
    void display();
}

class User implements SubscriberInterface{
    private String message;

    public void receive(String message){
        this.message = message;
        display();
    }
    public void display(){
        System.out.println("Message received is " + message);
    }
}


class MessengerService implements MessengerInterface{
    private List<User> users;

    public MessengerService(){
        users = new ArrayList<User>();
    }

    public void registerSubscriber(User user){
        users.add(user);
    }

    public void removeSubscriber(User user){
        users.remove(user);
    }

    public void notify(String message){
        for(User user : users){
            user.receive(message);
        }
    }

}
public class Q3 {
    public static void main(String[] args){
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        MessengerService messengerService = new MessengerService();
        messengerService.registerSubscriber(user1);
        messengerService.registerSubscriber(user2);
        messengerService.registerSubscriber(user3);

        messengerService.notify("Hello");

        messengerService.removeSubscriber(user2);

        messengerService.notify("Hello again");
    }
}
