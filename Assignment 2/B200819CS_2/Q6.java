import java.util.Scanner;

public class Q6 {

    public static void SecondLargest(int[] arr, int size) {
        int maxi = Integer.MIN_VALUE, secondMaxi = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > maxi) {
                secondMaxi = maxi;
                maxi = arr[i];
            } else if (arr[i] > secondMaxi && arr[i] != maxi) {
                secondMaxi = arr[i];
            }
        }

        if (secondMaxi == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element is " + secondMaxi);
        }
    }

    public static void SecondLargest_sort(int[] arr, int size) {
        int[] sorted = new int[size];

        for (int i = 0; i < size; i++)
            sorted[i] = arr[i];

        // sort using inbuilt sort
        java.util.Arrays.sort(sorted);

        int i = size - 1;
        while (i - 1 >= 0 && sorted[i] == sorted[i - 1])
            i--;

        if (i - 1 < 0) {
            System.out.println("No second largest found");
        } else {
            System.out.println("Second largest element is " + sorted[i - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = scan.nextInt();

        // Second largest element
        // 1. Sort the array
        // 2. Maintain two variables, one for largest and one for second largest

        SecondLargest(arr, size);
        // SecondLargest_sort(arr, size);

        scan.close();
    }
}
