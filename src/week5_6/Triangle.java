package week5_6;

public class Triangle extends Shape {

    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public Triangle(String color, boolean filled, double x, double y, double side1, double side2, double side3) {
        super(color, filled, x, y);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (side1 > 0) {
            this.side1 = side1;
        }
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (side2 > 0) {
            this.side2 = side2;
        }
    }
}