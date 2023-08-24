import java.util.Scanner;

public class Q3 {

    public static int findSum(int n) {
        if (n < 0)
            return 0;
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(findSum(n));

        scan.close();
    }
}
