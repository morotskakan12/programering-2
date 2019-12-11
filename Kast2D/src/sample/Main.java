package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import static java.lang.Math.*;

import java.awt.*;

public class Main extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch(args);
    }

    TextField velosity = new TextField("Velosity");
    TextField angle = new TextField("Angle");
    Button enter = new Button("Enter");
    VBox textContenerLeft = new VBox();
    Pane windo = new Pane ();
    GridPane contaner = new GridPane();
    @Override
    public void start(Stage primaryStage) throws Exception{
        angle.setMaxSize(50, 100);
        angle.setMinSize(50, 100);
        velosity.setMaxSize(50, 100);
        velosity.setMinSize(50, 100);
        enter.setMaxSize(50,100);
        enter.setMinSize(50,100);
        enter.setOnAction(this);
        textContenerLeft.getChildren().addAll(angle,velosity,enter);
        windo.prefHeight(300);
        windo.prefWidth(300);
        windo.setStyle("-fx-background-color: GREEN;");
        contaner.add(textContenerLeft, 0,0);
        Scene scene = new Scene(contaner, 300,400);
        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public void handle(ActionEvent event) {
        if (event.getSource()==enter){
            maxValu max = new maxValu();
            vacuumThrow vacuum = new vacuumThrow(1);
            resistanceThrow res = new resistanceThrow(1);
            graphics gp = new graphics();
            double v = Double.valueOf(velosity.getText());
            double a = Double.valueOf(angle.getText());

                if ((max.calkulatYmax(v,a)<100)&&(max.calkulatXmax(0,0 )<50)) {
                    vacuum.setZoom(2);
                    windo = gp.drawBagrund(windo, vacuum.getZoom());
                    for (double i = 0; i<250; i = i+0.01 ){
                        gp.drawBow(windo, res.calkulatX(v,a,i),res.calkulatY(v,a,i));
                        gp.drawBow(windo, vacuum.calkulatX(v,a,i),vacuum.calkulatY(v,a,i));
                    }
                     windo = gp.skal(windo , vacuum.getZoom());
                }else if ((max.calkulatYmax(v,a)>400)&&(max.calkulatXmax(0,0)>250)){
                    vacuum.setZoom(0.5);
                    windo = gp.drawBagrund(windo, vacuum.getZoom());
                    for (double i = 0; i<250; i = i+0.01 ){
                        gp.drawBow(windo, res.calkulatX(v,a,i),res.calkulatY(v,a,i));
                        gp.drawBow(windo, vacuum.calkulatX(v,a,i),vacuum.calkulatY(v,a,i));
                    }
                    windo = gp.skal(windo , vacuum.getZoom());
                }else {
                    vacuum.setZoom(1);
                    windo = gp.drawBagrund(windo, vacuum.getZoom());
                    for (double i = 0; i<250; i = i+0.01 ){
                        gp.drawBow(windo, res.calkulatX(v,a,i),res.calkulatY(v,a,i));
                        gp.drawBow(windo, vacuum.calkulatX(v,a,i),vacuum.calkulatY(v,a,i));
                    }
                }
            }
        }
    }




