import java.util.Scanner;

public class Q2 {

    public static int[] primes(int m, int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = 0;
        }

        arr[0] = arr[1] = 1;

        for (int i = 2; i * i <= n; i++) {
            if (arr[i] == 0) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        int count = 0;
        for (int i = m>0? m: 0; i <= n; i++) {
            if (arr[i] == 0)
                count++;
        }

        int[] ans = new int[count];
        int j = 0;

        for (int i = m>0? m: 0; i <= n; i++) {
            if (arr[i] == 0) {
                ans[j] = i;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        int[] arr = primes(m, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}
