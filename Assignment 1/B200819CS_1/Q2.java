import java.util.Scanner;

class Q2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        int a = scan.nextInt();

        System.out.print("b: ");
        int b = scan.nextInt();

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a = " + a + "\nb = " + b);
        
        scan.close();
    }
}
