// package Assign4B;
import java.util.*;
public class Q3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter car details: ");
        String s = scn.nextLine();
        String[] str = s.split(" ");
        Car c = new Car();
        c.e.engine_no = Integer.parseInt(str[0]);
        c.e.cc = Integer.parseInt(str[1]);
        c.color = str[2];
        c.price = Integer.parseInt(str[3]);
        System.out.println(c.e.engine_no+" "+c.e.cc+" "+c.color+" "+c.price);
    }
}

class Engine{
    int engine_no;
    int cc;
}
class Car{
    Engine e = new Engine();
    String color;
    int price;
}
