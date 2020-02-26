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
    resistanceThrow rc = new resistanceThrow();


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

        conterner.getChildren().addAll(velosity, angle, enter);

        enter.setOnAction(this);

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
        border = gp.gridclear(border);
        windo = gp.paneClear(windo);
        border.add(conterner, 0, 0);
        if (event.getSource() == enter) {
            double v = Double.valueOf(velosity.getText());
            double a = toRadians(Double.valueOf(angle.getText()));
            maxOf = gp.setText(maxOf,maxOfY,maxOfX,v,a);

            border.add(maxOf,0,1);

            if (maxValu.calkulatXmax(v,a)>120) {
                windo = gp.drawBagrund(windo, 250);
                double vrc = v;
                double v0x = vrc*cos(a); double v0y = vrc*sin(a);
                double a0y = rc.calkulatY(vrc,v0x); double a0x = rc.calkulatX(vrc,v0x);

                for (double t = 0.01; t < 100; t = t + 0.01) {
                    System.out.println("hejdå");
                    System.out.println("");
                    System.out.println(rc.calkulatX1(v,a,t));
                    System.out.println(rc.calkulatY1(v,a,t));
                    if(((vt.calkulatX(v,a,t) < 250) && (vt.calkulatY(v,a,t)> 0))||((rc.calkulatY1(v,a,t)> 0)&&(rc.calkulatX1(v,a,t)< 0))) {
                    //windo = gp.drawBow(windo,vt.calkulatX(v,a,t),vt.calkulatY(v,a,t));
                    windo = gp.drawBow(windo,vt.calkulatX(10+v,a,t),vt.calkulatY(10+v,a,t));

                    windo = gp.drawBow(windo,rc.calkulatX1(v0x,a,t),rc.calkulatY1(v0y,a,t));
                    v0x = v0x + (a0x *t); v0y = v0y + (a0y *t);

                    vrc = Math.sqrt((pow(v0x,2))+(pow(v0y,2)));

                    a0y = rc.calkulatY(vrc,v0x); a0x = rc.calkulatX(vrc,v0x);

                    }else if ((vt.calkulatY(v,a,t) > 0)||(rc.calkulatY1(v,a,t)> 0)){
                       // windo = gp.drawBow(windo,vt.calkulatX(10+v,a,t),vt.calkulatY(10+v,a,t));

                        windo = gp.drawBow(windo,rc.calkulatX1(v,a,t),rc.calkulatY1(v,a,t));
                    }
                }


            }else if (maxValu.calkulatXmax(v,a)<120) {

                windo = gp.drawBagrund(windo, 120);
                windo = gp.scale(windo,2);


                for (double t = 0.01; t < 100; t = t + 0.01) {
                    System.out.println("hej");
                    System.out.println("");
                    System.out.println(rc.calkulatX1(v,a,t));
                    System.out.println(rc.calkulatY1(v,a,t));
                    if(((vt.calkulatX(v,a,t) < 250) && (vt.calkulatY(v,a,t)> 0))||((rc.calkulatY1(v,a,t)> 0)&&(rc.calkulatX1(v,a,t)< 0))) {
                       //windo = gp.drawBow(windo,vt.calkulatX(v,a,t),vt.calkulatY(v,a,t));
                       // windo = gp.drawBow(windo,vt.calkulatX(10+v,a,t),vt.calkulatY(10+v,a,t));

                        windo = gp.drawBow(windo,rc.calkulatX1(v,a,t),rc.calkulatY1(v,a,t));
                    }else if ((vt.calkulatY(v,a,t) > 0)||(rc.calkulatY1(v,a,t)> 0)){
                        //windo = gp.drawBow(windo,vt.calkulatX(v,a,t),vt.calkulatY(v,a,t));
                       // windo = gp.drawBow(windo,vt.calkulatX(10+v,a,t),vt.calkulatY(10+v,a,t));
                        System.out.println(rc.calkulatX1(v,a,t));
                        System.out.println(rc.calkulatY1(v,a,t));
                        windo = gp.drawBow(windo,rc.calkulatX1(v,a,t),rc.calkulatY1(v,a,t));
                    }

                }

            }

            border.add(windo, 1, 0);

        }
    }

}