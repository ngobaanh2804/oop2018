package week5_6;
import java.util.ArrayList;
public class Diagram {

    public ArrayList<Layer> DiagramLayers = new ArrayList<>();

    public void removeCircleInDiagram() {
        for (int i = 0; i < DiagramLayers.size(); i++) {
            DiagramLayers.get(i).removeCircleInLayer();

        }
    }
    public void inDiagram() {
        for (int i = 0; i < DiagramLayers.size(); i++) {
            System.out.println("\nLayer " + (i + 1));
            DiagramLayers.get(i).inLayer();
        }
    }
}
