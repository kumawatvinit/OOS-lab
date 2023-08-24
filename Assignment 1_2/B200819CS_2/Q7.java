import java.util.Scanner;

public class Q7 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        char[] str = s.toCharArray();

        for(int i=0; i<s.length(); i++)
        {
            if(str[i] >= 'A' && str[i] <= 'Z')
            {
                str[i] = (char)(str[i] - 'A' + 'a');
            }
        }

        System.out.println(str);

        scan.close();
    }
}
