package Geometric_Shapes_Area;

public class Canvas {
    public static void main(String[] args) {

        Circle circle1 = new Circle(8);
        System.out.println("Area of the CIRCLE is: " + circle1.computeArea());

        Rectangle rectangle1 = new Rectangle(5,10);
        System.out.println("Area of the RECTANLGE is: " + rectangle1.computeArea());

        circle1.resize(30);
        System.out.println(circle1.getRadius());
    }

}