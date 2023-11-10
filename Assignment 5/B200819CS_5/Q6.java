abstract class Shape {
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Area extends Shape {
    @Override
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    double SquareArea(double side) {
        return side * side;
    }

    @Override
    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Area shapeCalculator = new Area();

        double length = 5.0;
        double breadth = 4.0;
        double side = 5.0;
        double radius = 3.0;

        double rectangleArea = shapeCalculator.RectangleArea(length, breadth);
        double squareArea = shapeCalculator.SquareArea(side);
        double circleArea = shapeCalculator.CircleArea(radius);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
