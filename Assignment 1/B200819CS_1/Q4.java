import java.util.Scanner;

class Q4 {
    static int reverseInteger(int n)
    {
        int ans = 0;

        while(n > 0)
        {
            ans = ans*10 + n%10;
            n/= 10;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(reverseInteger(n));

        scan.close();
    }
}
