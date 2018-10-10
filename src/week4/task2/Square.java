package week4.task2;

public class Square extends Rectangle{
    private double side;
    public Square(){
        this.side = 1.0;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side , String color , boolean filled){
        this.side = side;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public String toString() {
        return this.getColor() +","+this.isFilled()+","+ side;
    }
}
