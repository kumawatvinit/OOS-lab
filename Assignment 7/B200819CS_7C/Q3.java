// package Assign7C;
import java.util.*;
interface Shape{
    public void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}
class Triangle implements Shape{
    public void draw(){
        System.out.println("Triangle");
    }
}
class ShapeFactory{
    public Shape getShape(String shapeType){
        shapeType = shapeType.toLowerCase();
        return switch (shapeType) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            default -> null;
        };
    }
}
public class Q3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String shape = scn.nextLine();
        ShapeFactory obj = new ShapeFactory();
        Shape s = obj.getShape(shape);
        if(s==null){
            System.out.println("Invalid Shape");
            System.exit(0);
        }
        s.draw();
    }
}
