package week5_6;

public class Main {

    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        diagram.DiagramLayers.add(layer1);
        diagram.DiagramLayers.add(layer2);
        Rectangle rectangle = new Rectangle(2.5, 3.0);
        rectangle.setLength(3.1);
        Circle circle = new Circle(3.6);
        Triangle triangle = new Triangle(3, 4, 5);
        Square square = new Square(3.5);
        Rectangle rectangle2 = new Rectangle(2.5, 3.0);
        Circle circle2 = new Circle(3.6);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Square square2 = new Square(3.5);
        layer1.LayersList.add(rectangle);
        layer1.LayersList.add(circle);
        layer1.LayersList.add(triangle);
        layer1.LayersList.add(square);
        layer2.LayersList.add(rectangle2);
        layer2.LayersList.add(circle2);
        layer2.LayersList.add(triangle2);
        layer2.LayersList.add(square2);
        System.out.println("Truoc khi xoa Triangle:");
        layer1.inLayer();
        System.out.println("\nSau khi xoa Triangle: ");
        layer1.removeTriangleInLayer();
        layer1.inLayer();
        System.out.println("\nIn ra Diagram");
        diagram.inDiagram();
        System.out.println("\nDiagram sau khi xoa Circle:");
        diagram.removeCircleInDiagram();
        diagram.inDiagram();
    }
}
