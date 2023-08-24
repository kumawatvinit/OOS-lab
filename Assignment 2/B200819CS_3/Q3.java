import java.util.Scanner;

public class Q3 {
    public static void main(String[] agrs)
    {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String ans = "";

        boolean[] hash = new boolean[128];

        for(int i=0; i<input.length(); i++)
        {
            if(!hash[input.charAt(i)]) {
                hash[input.charAt(i)] = true;

                ans+= input.charAt(i);
            }
        }

        System.out.println(ans);

        scan.close();
    }
}
