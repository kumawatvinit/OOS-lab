// package Assign7A;
import java.util.*;

class NotDigitException extends Exception{
    NotDigitException(String s){
        super(s);
    }
}
class ZeroDivisionException extends Exception{
    ZeroDivisionException(String s){
        super(s);
    }
}
public class Q1 {
    void validate(String s) throws NotDigitException {
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                throw new NotDigitException("Non Digit Found");
            }
        }
    }
    void checkZero(String s) throws ZeroDivisionException{
        int i = Integer.parseInt(s);
        if(i==0){
            throw new ZeroDivisionException("Zero Found");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Q1 obj = new Q1();
        String op = sc.nextLine();
        String arg1 = sc.nextLine();
        String arg2 = sc.nextLine();
        try{
            obj.validate(arg1);
            obj.validate(arg2);
        }
        catch(NotDigitException e){
            System.out.println(e);
            System.exit(0);
        }
        if(op.equals("/")){
            try{
                obj.checkZero(arg2);
            }
            catch(ZeroDivisionException e){
                System.out.println(e);
                System.exit(0);
            }
        }
        int a = Integer.parseInt(arg1);
        int b = Integer.parseInt(arg2);
        switch (op) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
            default -> System.out.println("Invalid Operator");
        }
    }
}
