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
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import static java.lang.Math.*;

public class Controller extends Application implements EventHandler<ActionEvent> {
    GridPane border = new GridPane();
    TextField velosity = new TextField("15.49160825");
    TextField angle = new TextField("45");

    Pane  windo = new Pane ();

    VBox conterner = new VBox();
    Button enter = new Button("Enter");

    @Override
    public void start(Stage primaryStage) throws Exception {
        windo.prefHeight(200);
        windo.prefWidth(250);
        windo.setStyle("-fx-background-color: GREEN;");
        windo.getTransforms().add(new Rotate(180, 120, 120));
        angle.setMaxSize(50, 100);
        angle.setMinSize(50, 100);
        velosity.setMaxSize(50, 100);
        velosity.setMinSize(50, 100);
        enter.setPrefSize(50,50);
        conterner.getChildren().addAll(velosity, angle, enter);
        enter.setOnAction(this);
        border.add(conterner, 1, 1);
        border.add(windo, 2, 1);
        Scene scene = new Scene(border, 300, 250);
        primaryStage.setMaxWidth(300);
        primaryStage.setMaxHeight(275);
        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public  Pane drawBow(Pane zero, double v, double a, double t) {

        double x;
        double y;
        double g = 9.82;
        y = ((v * sin(a) * t) - ((g * (pow(t, 2))) / 2));
        x = (v * cos(a) * t);

        if((x < 250) && (y > 0)) {
            Circle temp = new Circle();
            temp.setFill(Color.RED);
            temp.setRadius(1);
            temp.setCenterX(x);
            temp.setCenterY(y);
            zero.getChildren().add(temp);
        }else if (y > 0){
            transform(maxY(a,v),maxX(a,v));
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
            for (double t = 0.01; t < 100; t = t + 0.01) {
                windo = drawBow(windo, v, a, t);
                ZoomingPane z = new ZoomingPane(windo);

            }

        }
    }
    public void transform(double x,double y){

    }

}
