import java.util.Scanner;

class Q1 {

    public static boolean isPalindrome(int n)
    {
        int temp = n;
        int rev = 0;

        while(temp > 0)
        {
            rev = rev*10 + temp%10;
            temp/= 10;
        }

        return rev == n;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");

        scan.close();
    }
}
