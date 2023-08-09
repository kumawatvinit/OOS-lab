import java.util.Scanner;

public class Q8 {

    public static char[] reverse(String s)
    {
        char[] str = s.toCharArray();

        int left = 0, right = s.length()-1;

        while(left < right)
        {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }

        return str;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(reverse(s));

        scan.close();
    }
}
