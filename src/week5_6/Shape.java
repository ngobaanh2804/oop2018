package week5_6;

public class Shape extends Layer {

    private double x;
    private double y;
    private String color;
    private boolean filled = true;
    public Shape() {
    }
    public Shape(String color, boolean filled, double x, double y) {
        this.color = color;
        this.filled = filled;
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public void move(double dX, double dY) {
        x += dX;
        y +=dY;
        System.out.println("x = " +x);
        System.out.println("y = " +y);
    }
    public void in(){
    }
}
