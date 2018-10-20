package week5_6;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double x, double y, double length, double width) {
        super(color, filled, x, y);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }
}