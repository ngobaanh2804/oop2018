package week5_6;

public class Square extends Shape {

    private double side = 1;
    public Square() {

    }
    public Square(double side) {
        if (side > 0) {
            this.side = side;
        }
    }
    public Square(String color, boolean filled, double x, double y, double side) {
        super(color, filled, x, y);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public String toString() {
        return "Square ";
    }
}
