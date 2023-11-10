abstract class AbstractClass {
    AbstractClass() {
        System.out.println("This is the constructor of the abstract class");
    }

    abstract void a_method();

    void normalMethod() {
        System.out.println("This is a normal method of the abstract class");
    }
}

class SubClass extends AbstractClass {
    @Override
    void a_method() {
        System.out.println("This is the abstract method");
    }
}

public class Q4 {
    public static void main(String[] args) {
        SubClass subObj = new SubClass();

        
        subObj.a_method();  
        subObj.normalMethod();  
    }
}
