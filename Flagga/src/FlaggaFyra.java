import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FlaggaFyra {

    public static Group createFlagFyra(Group panel) {
        //Drawing a Circle
        Rectangle red = new Rectangle();
        Rectangle blu = new Rectangle();
        //Setting the properties of the circle

        blu.setHeight(300);
        blu.setWidth(50);
        blu.setX(200);
        red.setHeight(50);
        red.setWidth(600);
        red.setY(125);

        blu.setFill(Color.YELLOW);
        red.setFill(Color.YELLOW);
        //Creating a Group object


        //Creating a scene object
        panel.getChildren().addAll(blu,red);
        return panel;
    }

}
