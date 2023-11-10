// package Assign7C;
import java.util.*;

class SessionManager{
    private static SessionManager sessionManager;
    //List to store tuples of username and password
    List<List<String>> users = new ArrayList<>();

    private SessionManager(){
        List<String> admin = new ArrayList<>();
        admin.add("admin");
        admin.add("admin");
        users.add(admin);
        List<String> user1 = new ArrayList<>();
        user1.add("user1");
        user1.add("user1");
        users.add(user1);
    }
    public static SessionManager getInstance(){
        if(sessionManager==null){
            sessionManager = new SessionManager();
        }
        return sessionManager;
    }
    public void Login(String username, String password){
        boolean flag = false;
        for(List<String> user:users){
            if(user.get(0).equals(username) && user.get(1).equals(password)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }

}
public class Q2 {
}
