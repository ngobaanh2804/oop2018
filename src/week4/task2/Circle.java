package week4.task2;

    public class Circle extends Shape{
        private double radius;
        final private double Pi = 3.14;
        public Circle(){
            this.radius = 1.0;
        }
        public Circle(double radius){
            this.radius = radius;
        }
        public Circle(double radius , String color , boolean filled){
            this.radius = radius;
            this.setColor(color);
            this.setFilled(filled);
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getArea(){
            return (Pi*getRadius()*getRadius());
        }
        public double getPerimeter(){
            return (2*Pi*getRadius());
        }
        public String toString() {
            return super.toString() +","+this.getRadius();
        }
    }
