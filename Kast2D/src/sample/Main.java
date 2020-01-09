package sample;
import com.sun.org.apache.bcel.internal.generic.INEG;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import static java.lang.Math.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Main extends Application implements EventHandler<ActionEvent> {
    GridPane border = new GridPane();
    TextField velosity = new TextField("15.49160825");
    TextField angle = new TextField("45");
    Pane  windo = new Pane ();
    VBox conterner = new VBox();
    Button enter = new Button("Enter");
    graphics GP = new graphics();
    vacuumThrow VT = new vacuumThrow(1);

    @Override
    public void start(Stage primaryStage) throws Exception {
        windo.prefHeight(205);
        windo.prefWidth(200);
        windo.setStyle("-fx-background-color: GREEN;");

        windo.rotateProperty().setValue(180);

        angle.setMaxSize(50, 100);
        angle.setMinSize(50, 100);
        velosity.setMaxSize(50, 100);
        velosity.setMinSize(50, 100);
        enter.setPrefSize(50,50);

        conterner.getChildren().addAll(velosity, angle, enter);
        enter.setOnAction(this);

        border.getChildren().add(conterner);

        Scene scene = new Scene(border, 300, 400);

        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }




    @Override
    public void handle(ActionEvent event) {

        if (event.getSource() == enter) {
            double v = Double.valueOf(velosity.getText());
            double a = Double.valueOf(angle.getText());

            if (maxValu.calkulatXmax(a,v)>120) {

                windo = GP.drawBagrund(windo, 250);

                for (double t = 0.01; t < 100; t = t + 0.01) {

                    windo = GP.drawBow(windo,VT.calkulatX(v,a,t),VT.calkulatY(v,a,t));
                }


            }else if (maxValu.calkulatXmax(a,v)<120) {
                VT.setZoom(2);
                windo = GP.drawBagrund(windo, 120);
                windo = GP.scale(windo,VT.getZoom());

                for (double t = 0.01; t < 100; t = t + 0.01) {
                    if ((VT.calkulatX(v,a,t)<250)&&(VT.calkulatY(v,a,t)>0)){
                        GP.drawBow(windo,VT.calkulatX(v,a,t),VT.calkulatY(v,a,t));
                    }else if ((VT.calkulatY(v,a,t)>0)){
                        GP.drawBow(windo,VT.calkulatX(v,a,t),VT.calkulatY(v,a,t));
                    }
                }

            }

            border.add(windo, 1, 0);
        }
    }


}