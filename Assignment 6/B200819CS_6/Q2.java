import java.util.*;

public class Q2 {
    double area(double radius){
        return 3.1415926535 * radius * radius;
    }
    double area(double length, double breadth){
        return length * breadth;
    }
    double area(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    String formatted(double area){
        return String.format("%.2f", area);
    }
    public static void main(String[] args){
        Q2 q = new Q2();
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arr = s.split(" ");
        if(arr.length == 1){
            double radius = Double.parseDouble(arr[0]);
            System.out.println("Circle:"+q.formatted(q.area(radius)));
        }
        else if(arr.length == 2){
            double length = Double.parseDouble(arr[0]);
            double breadth = Double.parseDouble(arr[1]);
            System.out.println("Rectangle:"+q.formatted(q.area(length, breadth)));
        }
        else if(arr.length == 3){
            double a = Double.parseDouble(arr[0]);
            double b = Double.parseDouble(arr[1]);
            double c = Double.parseDouble(arr[2]);
            System.out.println("Square:"+q.formatted(q.area(a, b, c)));
        }
        else
            System.out.println("Invalid Input");
    }
}
