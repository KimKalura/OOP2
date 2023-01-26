package Geometric_Shapes_Area;

public class Circle implements Shape, Resizable {
    private double radius;
    static final double π = Math.PI;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        double circleArea = π * radius * radius;
        return circleArea;
    }

//    @Override
//    public String toString() {
//        return "Circle{" +
//                "radius=" + radius +
//                '}';
//    }

    @Override
    public void resize(double percent) {
        radius = radius * (percent / 100);
    }
}
