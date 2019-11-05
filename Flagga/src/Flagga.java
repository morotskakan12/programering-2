
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Flagga extends flaggaAB {
    @Override
    public String getFlagName(){return "Flagga";}

    @Override
    public Node getFlag() {

        Group gp = new Group();
        //Drawing a Circle
        Rectangle red = new Rectangle();
        Rectangle blu = new Rectangle();
        //Setting the properties of the circle
        blu.setHeight(300);
        blu.setWidth(200);
        blu.setX(400);
        red.setHeight(300);
        red.setWidth(200);

        /*r.setArcWidth(20);
        r.setArcHeight(20);

        */
        blu.setFill(Color.RED);
        red.setFill(Color.BLUE);
        //Creating a Group object
        gp.getChildren().addAll(blu,red);
        return gp;
    }

}
