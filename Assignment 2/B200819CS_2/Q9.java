import java.util.Scanner;

public class Q9 {

    public static boolean areEqual(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scan.nextLine();

        System.out.print("Enter second string: ");
        String s2 = scan.nextLine();

        System.out.println(areEqual(s1, s2) ? "They are equal" : "No, both are different");

        scan.close();
    }
}
