// package Assign7A;
import java.util.*;
public class Q3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();
        String[] arr = s.split(" ");
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        s = scn.nextLine();
        arr = s.split(" ");
        int size = arr.length;
        int[] indexes = new int[size];
        for(int i=0;i<size;i++){
            indexes[i] = Integer.parseInt(arr[i]);
        }
        int sum = 0;
        for(int i=0;i<size;i++){
            try{
                sum+=a[indexes[i]];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Enter valid index");
                System.exit(0);
            }
        }
        System.out.println(sum);
    }
}
