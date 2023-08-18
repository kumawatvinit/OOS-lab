import java.util.Scanner;

public class Q5 {
    public static void main(String[] agrs)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the inmate details: ");
        String name = scan.next();
        String role = scan.next();
        String type = scan.next();

        System.out.print("Enter the number of days: ");
        int n = scan.nextInt();

        int price = (type.equals("veg") ? 100 : 120);
        double total = price*n;

        if(role.equals("employee")) {
            total = total + total*0.05;
        }
        
        System.out.println(total);

        scan.close();
    }
}