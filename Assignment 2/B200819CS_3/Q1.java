// import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] agrs)
    {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) arr[i] = scan.nextInt();

        int left = 0, right = 1;

        for( ; right < size; right++) 
        {
            if(left > 1 && arr[left-1] == arr[right]) {
                continue;
            } else {
                arr[left+1] = arr[right];
                left++;
            }
        } 

        System.out.println(left+1);

        scan.close();
    }
}