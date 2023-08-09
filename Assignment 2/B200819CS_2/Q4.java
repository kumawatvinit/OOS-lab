import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

    public static int BruteForce(int[] arr, int size, int key) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static boolean BinarySearch(int[] arr, int size, int key)
    {
        int low = 0, high = size-1;

        while(low <= high)
        {
            int mid = (low+high)/2;

            if(arr[mid] == key) return true;
            else if(arr[mid] > key) high = mid-1;
            else low = mid+1;
        }

        return false;
    }

    public static boolean Inbuilt(int[] arr, int size, int key)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int element: arr) array.add(element);

        return array.contains(key);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = scan.nextInt();

        int ans = BruteForce(arr, size, key);
        System.out.println(ans != -1? "Found at index " + ans : "Not Found");
        // System.out.println(BinarySearch(arr, size, key));
        // System.out.println(Inbuilt(arr, size, key));

        scan.close();
    }
}
