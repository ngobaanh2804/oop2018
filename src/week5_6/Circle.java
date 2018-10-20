package week5_6;

public class Circle extends Shape {
    private double radius;
    public Circle() {

    }
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
    public Circle(String color, boolean filled, double x, double y, double radius) {
        super(color, filled, x, y);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle";
    }
}
