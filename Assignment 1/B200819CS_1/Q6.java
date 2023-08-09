import java.util.Scanner;

public class Q6 {

    static boolean isNumPalindrome(int n)
    {
        int m = 0;
        int k = n;

        // reverse
        while(k>0)
        {
            m = m*10 + k%10;
            k/= 10;
        }

        return m == n;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(isNumPalindrome(n));

        scan.close();
    }    
}
