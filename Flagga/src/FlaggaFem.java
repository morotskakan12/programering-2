
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class FlaggaFem{
    public static StackPane createFlagFem(StackPane panel) {

        Rectangle red = new Rectangle();
        Rectangle blu = new Rectangle();
        blu.setHeight(200);
        blu.setWidth(50);
        red.setWidth(200);
        red.setHeight(50);
        red.setFill(Color.WHITE);
        blu.setFill(Color.WHITE);

        panel.getChildren().addAll(blu,red);
        return panel;
    }

}