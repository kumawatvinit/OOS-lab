import java.util.Scanner;

public class Q2 {
    public static void main(String[] agrs)
    {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int count = 1;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Words count is " + count);

        for(int i=0; i<str.length(); i++)
        {
            System.out.println("'" + str.charAt(i) + "'" + " " + (int)str.charAt(i));
        }

        scan.close();
    }
}
