import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class test extends Application implements EventHandler<ActionEvent> {
    GridPane border = new GridPane();
    HBox hb = new HBox();
    HBox hb2 = new HBox();
    @Override
    public void start(Stage primaryStage) throws Exception {

        hb.setBackground(new Background(new BackgroundFill(Color.rgb(20, 220, 220), CornerRadii.EMPTY, Insets.EMPTY)));
        hb.setPrefSize(200,200);
        hb2.setBackground(new Background(new BackgroundFill(Color.rgb(20, 220, 22), CornerRadii.EMPTY, Insets.EMPTY)));
        hb2.setPrefSize(200,200);

        border.add(hb,1,1);
        border.add(hb2,1,2);
        border.setMargin(hb, new Insets(5, 10, 5, 10));
        border.setPadding(new Insets(10,10,10,10));
        Scene scene = new Scene(border, 600, 350);

        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {

    }
}
