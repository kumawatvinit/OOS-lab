import java.util.Scanner;

public class Q7 {

    public static void fibonacci(int n)
    {
        if(n <= 0) return;
        if(n == 1) {
            System.out.println(0);
            return;
        }
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for(int i=3; i<=n; i++)
        {
            int curr = a+b;
            System.out.print(curr + " ");

            a = b;
            b = curr;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        fibonacci(n);

        scan.close();
    }
}
