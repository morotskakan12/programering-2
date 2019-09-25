import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Flagga extends Application {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        //Drawing a Circle
        Rectangle r = new Rectangle();
        //Setting the properties of the circle
        r.setHeight(300);
        r.setWidth(300);
        r.setX(50);
        r.setY(50);
        /*r.setArcWidth(20);
        r.setArcHeight(20);

        */
        r.setFill(Color.RED);
        //Creating a Group object
        Group root = new Group(r);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);
        //Setting title to the Stage
        primaryStage.setTitle("Drawing a Circle");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
