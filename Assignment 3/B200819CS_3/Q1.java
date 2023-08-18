// import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] agrs)
    {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) arr[i] = scan.nextInt();
        /*
        Later....
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int start = 1;
        while(true)
        {
            int loc = input.indexOf(',', start);
            if(loc == -1) {
                // int ele = Integer.parseInt(input.substring(start+1, input.length()-1));
                // arr.add(ele);
                System.out.println(input.substring(start+1, input.length()-1));
                break;
            } else {
                System.out.println(input.substring(start+1, loc));
                // int ele = Integer.parseInt(input.substring(start+1, loc));
                // arr.add(ele);

                start = loc;
            }
        }
        */

        // for(int i: arr) System.out.print(i+" ");

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

        // for(int i=0; i<=left; i++) System.out.print(arr[i] + " ");

        scan.close();
    }
}