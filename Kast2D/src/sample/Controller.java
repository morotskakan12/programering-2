package sample;

import com.sun.org.apache.bcel.internal.generic.INEG;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import static java.lang.Math.*;

public class Controller extends Application implements EventHandler<ActionEvent> {
    GridPane border = new GridPane();
    TextField velosity = new TextField("40");
    TextField angle = new TextField("40");

    Pane windo = new Pane();

    VBox conterner = new VBox();
    Button enter = new Button("Enter");

    @Override
    public void start(Stage primaryStage) throws Exception {
        windo.prefHeight(200);
        windo.prefWidth(250);
        windo.setStyle("-fx-background-color: GREEN;");
        windo.getTransforms().add(new Rotate(180, 213, 250));
        angle.setMaxSize(75, 100);
        angle.setMinSize(75, 100);
        velosity.setMaxSize(75, 100);
        velosity.setMinSize(75, 100);
        conterner.getChildren().addAll(velosity, angle, enter);
        enter.setOnAction(this);
        border.add(conterner, 1, 1);
        border.add(windo, 2, 1);
        Scene scene = new Scene(border, 500, 500);

        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static Pane drawBow(Pane zero, double v, double a, double t) {

        double x;
        double y;
        double g = 9.82;
        y = ((v * sin(a) * t) - ((g * (pow(t, 2))) / 2));
        x = (v * cos(a) * t);
        if(x < 425 && y > 0) {
            Circle temp = new Circle();
            temp.setFill(Color.RED);
            temp.setRadius(1);
            temp.setCenterX(x);
            temp.setCenterY(y);
            zero.getChildren().add(temp);
        }
        return zero;
    }
    public  double maxY(double a,double v){
        a = toRadians(a);
        return a = (pow(v,2)*pow(sin(a),2))/(2*9.82) ;
    }
    public static double maxX(double a,double v){
        a = toRadians(a);
        return (pow(v, 2)*sin(2*a))/9.82;
    }

    @Override
    public void handle(ActionEvent event) {

        if (event.getSource() == enter) {
            double v = Double.valueOf(velosity.getText());
            double a = Double.valueOf(angle.getText());
            System.out.println(maxX(a,v));
            System.out.println(maxY(a,v));
            a = toRadians(a);
            for (double t = 0.1; t < 100; t = t + 0.1) {
                windo = drawBow(windo, v, a, t);
            }

        }



    }

}