// package Assign7A;
import java.util.*;

class OutOfBoundsException extends Exception{
    OutOfBoundsException(String s){
        super(s);
    }
}

public class Q5 {
    void check(int i, int j) throws OutOfBoundsException{
        if(i<1 || i>8 || j<1 || j>8){
            throw new OutOfBoundsException("Overflow");
        }
    }
    public static void main(String[] args){
        Q5 obj = new Q5();
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        int j = scn.nextInt();
        int n = scn.nextInt();
        scn.nextLine();
        String[][] arr = new String[n][2];
        for(int k=0;k<n;k++){
            arr[k] = scn.nextLine().split(" ");
        }
        for(int k=0;k<n;k++){
            switch (arr[k][0]) {
                case "Up" -> i -= Integer.parseInt(arr[k][1]);
                case "Down" -> i += Integer.parseInt(arr[k][1]);
                case "Left" -> j -= Integer.parseInt(arr[k][1]);
                case "Right" -> j += Integer.parseInt(arr[k][1]);
            }
            try{
                obj.check(i,j);
            }
            catch(OutOfBoundsException e){
                System.out.println(e);
                System.exit(0);
            }
        }
        System.out.println(i+" "+j);
    }
}
