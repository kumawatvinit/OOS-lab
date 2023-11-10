import java.util.*;

public class Q1 {
    int bitwise(int a, int b){
        return a & b;
    }
    int bitwise(int a, int b, int c){
        return a & b & c;
    }
    public static void main(String[] args){
        Q1 q = new Q1();
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arr = s.split(" ");
        if(arr.length == 2){
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            System.out.println(q.bitwise(a, b));
        }
        else if(arr.length == 3){
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            System.out.println(q.bitwise(a, b, c));
        }
        else
            System.out.println("Invalid Input");
    }
}
