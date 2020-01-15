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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import static java.lang.Math.*;

public class Main extends Application implements EventHandler<ActionEvent> {
    GridPane border = new GridPane();
    TextField velosity = new TextField("15.49160825");
    TextField angle = new TextField("45");
    Text maxOfX = new Text("");
    Text maxOfY = new Text("");
    Pane  windo = new Pane ();
    Pane  clearWindo = new Pane ();
    VBox conterner = new VBox();
    VBox maxOf = new VBox();
    Button enter = new Button("Enter");
    Button clear = new Button("clear");

    @Override
    public void start(Stage primaryStage) throws Exception {
        windo.setMaxHeight(150);
        windo.setMaxWidth(200);
        windo.setStyle("-fx-background-color: GREEN;");
        windo.rotateProperty().setValue(180);

        angle.setMaxSize(50, 100);
        angle.setMinSize(50, 100);
        velosity.setMaxSize(50, 100);
        velosity.setMinSize(50, 100);
        enter.setPrefSize(50,50);
        clear.setPrefSize(50,50);
        conterner.getChildren().addAll(velosity, angle, enter, clear);

        enter.setOnAction(this);
        clear.setOnAction(this);

        border.add(conterner, 0, 0);

        Scene scene = new Scene(border, 300, 400);
        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    @Override
    public void handle(ActionEvent event) {
        graphics gp = new graphics();
        vacuumThrow vt = new vacuumThrow();
        if (event.getSource() == enter) {
            clearWindo = windo;
            double v = Double.valueOf(velosity.getText());
            double a = toRadians(Double.valueOf(angle.getText()));
            maxOfX.setText( "Max Valu of X"+" "+(Double.toString((int)maxValu.calkulatXmax(v,a))));
            maxOfY.setText( "Max Valu of Y"+" "+(Double.toString((int)maxValu.calkulatYmax(v,a))));
            maxOf.getChildren().addAll(maxOfX,maxOfY);
            border.add(maxOf,0,1);
            System.out.println(maxValu.calkulatXmax(v,a));
            System.out.println(maxValu.calkulatYmax(v,a));

            if (maxValu.calkulatXmax(v,a)>120) {
                System.out.println("hejdå");
                windo = gp.drawBagrund(windo, 250);

                for (double t = 0.01; t < 100; t = t + 0.01) {
                    if((vt.calkulatX(v,a,t) < 250) && (vt.calkulatY(v,a,t)> 0)) {
                    windo = gp.drawBow(windo,vt.calkulatX(v,a,t),vt.calkulatY(v,a,t));
                    }else if (vt.calkulatY(v,a,t) > 0){
                        windo = gp.drawBow(windo,vt.calkulatX(v,a,t),vt.calkulatY(v,a,t));
                    }
                }


            }else if (maxValu.calkulatXmax(v,a)<120) {
                System.out.println("hej");

                windo = gp.drawBagrund(windo, 120);
                windo = gp.scale(windo,2);


                for (double t = 0.01; t < 100; t = t + 0.01) {
                    if((vt.calkulatX(v,a,t) < 250) && (vt.calkulatY(v,a,t)> 0)) {
                        windo = gp.drawBow(windo,vt.calkulatX(v,a,t),vt.calkulatY(v,a,t));
                    }else if (vt.calkulatY(v,a,t) > 0){
                        windo = gp.drawBow(windo,vt.calkulatX(v,a,t),vt.calkulatY(v,a,t));
                    }

                }

            }

            border.add(windo, 1, 0);
        }
    }

}