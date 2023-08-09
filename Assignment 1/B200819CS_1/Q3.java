import java.util.Scanner;

public class Q3 {
    
    static int count(int n)
    {
        int ans = 0;
        if(n == 0) return 1;

        while(n > 0)
        {
            ans++;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(count(n));

        scan.close();
    }
}
