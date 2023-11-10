abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}

public class Q1 {
    public static void main(String[] args) {
        FirstSubclass firstObj = new FirstSubclass();
        SecondSubclass secondObj = new SecondSubclass();
        
        firstObj.message(); // Call the message method of the first subclass
        secondObj.message(); // Call the message method of the second subclass
    }
}
