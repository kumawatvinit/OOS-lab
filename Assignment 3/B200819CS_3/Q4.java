import java.util.Scanner;

public class Q4 {
    public static boolean isPalindrome(String str, int start, int end)
    {
        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end)) return false;

            start++;
            end--;
        }

        return true;
    }
    public static int solve(String str)
    {
        // Brute force
        int ans = 1;
        
        for(int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<str.length(); j++)
            {
                if(isPalindrome(str, i, j)) {
                    ans = Math.max(ans, j-i+1);
                }
            }
        }

        return ans;
    }
    public static void main(String[] agrs)
    {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println(solve(str));

        scan.close();
    }
}
