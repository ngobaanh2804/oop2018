package week5_6;
import java.util.ArrayList;
public class Layer extends Diagram {

    public ArrayList<Shape> LayersList = new ArrayList<>();
    public void removeTriangleInLayer() {
        for (int i = 0; i < LayersList.size(); i++) {
            if (LayersList.get(i) instanceof Triangle) {
                LayersList.remove(i);
            }

        }
    }
    public void removeCircleInLayer() {
        for (int i = 0; i < LayersList.size(); i++) {
            if (LayersList.get(i) instanceof Circle) {
                LayersList.remove(i);

            }
        }
    }
    public void inLayer(){
        for(int i=0; i<LayersList.size(); i++){
            System.out.println(LayersList.get(i).toString());
        }
    }

}
