// package Assign4B;
import java.util.*;
public class Q8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Add a = new Add();
        int choice;
        do{
            System.out.println("***************");
            System.out.println("1. Add 2 numbers");
            System.out.println("2. Add 3 numbers");
            System.out.println("3. -1*number");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            choice = scn.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter 2 numbers: ");
                    int a1 = scn.nextInt();
                    int b1 = scn.nextInt();
                    System.out.println("Sum: " + a.add(a1, b1));
                }
                case 2 -> {
                    System.out.print("Enter 3 numbers: ");
                    int a2 = scn.nextInt();
                    int b2 = scn.nextInt();
                    int c2 = scn.nextInt();
                    System.out.println("Sum: " + a.add(a2, b2, c2));
                }
                case 3 -> {
                    System.out.print("Enter number: ");
                    int a3 = scn.nextInt();
                    System.out.println("Sum: " + a.neg(a3));
                }
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
            System.out.println("***************");
        }while(choice!=4);
    }
}
class Add{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int neg(int a){
        return -a;
    }
}
