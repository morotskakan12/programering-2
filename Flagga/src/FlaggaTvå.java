
import javafx.scene.Group;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class FlaggaTvå extends flaggaAB {

    public static Node createFlagTvå(Group group) {
    }

    @Override
    public String getFlagName(){return "FlaggaTvå";}

    @Override
    public Node getFlag() {
        //Drawing a Circle
        Group gp = new Group();
        Rectangle red = new Rectangle();
        Rectangle blu = new Rectangle();
        //Setting the properties of the circle
        blu.setHeight(300);
        blu.setWidth(200);
        blu.setX(400);
        red.setHeight(300);
        red.setWidth(200);

        blu.setFill(Color.GREEN);
        red.setFill(Color.ORANGE);
        //Creating a Group object
        gp.getChildren().addAll(blu,red);
        return gp;
        //Creating a scene object

    }

}
