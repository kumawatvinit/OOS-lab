// package Assign4B;
import java.util.*;
public class Q7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of shapes: ");
        int n = scn.nextInt();
        scn.nextLine();
        List<Circle> circles = new ArrayList<>();
        List<Rectangle> rects = new ArrayList<>();
        List<Square> squares= new ArrayList<>();
        int choice;
        for(int i=0;i<n;i++){
            System.out.print("Enter 1 for circle, 2 for rectangle, 3 for square");
            choice = scn.nextInt();
            scn.nextLine();
            if(choice == 1){
                System.out.print("Enter radius: ");
                int radius = scn.nextInt();
                scn.nextLine();
                Circle c = new Circle();
                c.setRadius(radius);
                c.display();
                circles.add(c);
            }
            else if(choice == 2){
                System.out.print("Enter Length and Breadth: ");
                String s = scn.nextLine();
                String[] str = s.split(" ");
                int length = Integer.parseInt(str[0]);
                int breadth = Integer.parseInt(str[1]);
                Rectangle r = new Rectangle();
                r.setLength(length);
                r.setBreadth(breadth);
                r.display();
                rects.add(r);
            }
            else if(choice == 3){
                System.out.print("Enter side: ");
                int side = scn.nextInt();
                scn.nextLine();
                Square s = new Square();
                s.setSide(side);
                s.display();
                squares.add(s);
            }
        }
        System.out.print("Enter the threshold value: ");
        int threshold = scn.nextInt();
        scn.nextLine();
        List<Circle> thresholdCircles = circles.stream().filter(c -> c.area > threshold).toList();
        List<Rectangle> thresholdRects = rects.stream().filter(r -> r.area > threshold).toList();
        List<Square> thresholdSquares = squares.stream().filter(s -> s.area > threshold).toList();
        StringBuilder sb = new StringBuilder();
        for(Circle c: thresholdCircles){
            sb.append("Circle" + "(").append(c.getRadius()).append(")").append(" ");
        }
        for(Rectangle r: thresholdRects){
            sb.append("Rectangle" + "(").append(r.getLength()).append(",").append(r.getBreadth()).append(")").append(" ");
        }
        for(Square s: thresholdSquares){
            sb.append("Square" + "(").append(s.getSide()).append(")").append(" ");
        }
        String str = sb.toString();
        str = str.replace(" ", ",");
        if(str.length() == 0){
            System.out.println("No shapes with area greater than threshold");
        }
        else{
            System.out.println("The shapes are: "+str);
        }
    }
}

class Circle {
    private int radius;
    double area;
    public void setRadius(int radius){
        this.radius = radius;
        this.area = getArea();
    }
    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
    public void display(){
        System.out.println("The area is "+area+" and the perimeter is "+getPerimeter());
    }
}

class Rectangle{
    private int length;
    private int breadth;

    int area;

    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    public int getArea(){
        area = length * breadth;
        return area;
    }
    public int getPerimeter(){
        return 2 * (length + breadth);
    }
    public void display(){
        System.out.println("The area is "+getArea()+" and the perimeter is "+getPerimeter());
    }
}
class Square{
    private int side;

    int area;

    public void setSide(int side){
        this.side = side;
    }
    public int getSide(){
        return side;
    }
    public int getArea(){
        area = side * side;
        return area;
    }
    public int getPerimeter(){
        return 4 * side;
    }
    public void display(){
        System.out.println("The area is "+getArea()+" and the perimeter is "+getPerimeter());
    }
}