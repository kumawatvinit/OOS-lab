// package Assign7A;
import java.util.*;

public class Q7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String hex = scn.nextLine();
        int i = 0;
        try{
            i = Integer.parseInt(hex,16);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Hexadecimal Number");
            System.exit(0);
        }
        System.out.println(i);
    }
}
