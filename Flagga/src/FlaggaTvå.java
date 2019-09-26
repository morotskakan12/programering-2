
import javafx.scene.Group;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class FlaggaTvå {

    public static Group createFlagTvå(Group panel) {
        //Drawing a Circle
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
        panel.getChildren().addAll(blu,red);
        return panel;
        //Creating a scene object

    }

}
