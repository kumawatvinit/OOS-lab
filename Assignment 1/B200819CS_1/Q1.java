import java.util.Scanner;

class Q1 {
    public static int findPow(int x, int n)
    {
        int ans = 1;
        for(int i=1; i<=n; i++)
        {
            ans*= x;
        }

        return ans;
    }

    public static int customPow(int x, int n)
    {
        int ans = 1;

        while(n > 0)
        {
            if(n%2 == 1) {
                ans*= x;
                n-= 1;
            } else {
                n/=2;
                x*= x;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base of the number: ");
        int x = scan.nextInt();
        System.out.println("Enter the exponent: ");
        int n = scan.nextInt();

        // System.out.println(findPow(x, n));
        System.out.println(customPow(x, n));


        scan.close();
    }


}
