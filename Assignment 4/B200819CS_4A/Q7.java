// package Assign4A;
import java.util.*;
class Angle{
    int degrees;
    int minutes;

    public Angle(int degrees, int minutes){
        this.degrees = degrees;
        this.minutes = minutes;
    }
    public Angle angleSum(Angle a1, Angle a2){
        int degrees = a1.degrees + a2.degrees;
        int minutes = a1.minutes + a2.minutes;
        if(minutes >= 60){
            degrees += 1;
            minutes %= 60;
        }
        return new Angle(degrees, minutes);
    }
}
public class Q7 {
    public static void main(String[] args){
        int degrees, minutes;
        Scanner sc = new Scanner(System.in);
        degrees = sc.nextInt();
        minutes = sc.nextInt();
        Angle a1 = new Angle(degrees, minutes);
        degrees = sc.nextInt();
        minutes = sc.nextInt();
        Angle a2 = new Angle(degrees, minutes);
        Angle a3 = a1.angleSum(a1, a2);
        System.out.println(a3.degrees + " " + a3.minutes);
    }
}
