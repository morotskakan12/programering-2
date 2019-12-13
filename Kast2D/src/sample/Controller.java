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

public class Controller extends Application implements EventHandler<ActionEvent> {
    GridPane border = new GridPane();
    TextField velosity = new TextField("15.49160825");
    TextField angle = new TextField("45");

    Pane  windo = new Pane ();

    VBox conterner = new VBox();
    Button enter = new Button("Enter");

    @Override
    public void start(Stage primaryStage) throws Exception {
        windo.prefHeight(205);
        windo.prefWidth(200);
        windo.setStyle("-fx-background-color: GREEN;");
        //windo.getTransforms().add(new Rotate(180, 120, 120));
        windo.rotateProperty().setValue(180);
        angle.setMaxSize(50, 100);
        angle.setMinSize(50, 100);
        velosity.setMaxSize(50, 100);
        velosity.setMinSize(50, 100);
        enter.setPrefSize(50,50);
        conterner.getChildren().addAll(velosity, angle, enter);
        enter.setOnAction(this);
        border.add(conterner, 0, 0);
        //border.add(windo, 1, 0);
        Scene scene = new Scene(border, 300, 400);
        //primaryStage.setMaxWidth(300);
        //primaryStage.setMaxHeight(275);
        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
    public Pane drawBagrund (Pane zero,int setSkal){
        System.out.println("varför");
        for(int i =0;i<setSkal;i=i+10){
            Rectangle temp2 =new Rectangle();
            temp2.setWidth(1);
            temp2.setHeight(10);
            temp2.setX(i);
            temp2.setY(0);
            zero.getChildren().add(temp2);
        }
        return zero;
    }
    public Pane drawBagrund2 (Pane zero,int setSkal){
        System.out.println("varför");
        for(int i =0;i<setSkal;i=i+10){
            Rectangle temp2 =new Rectangle();
            temp2.setWidth(1);
            temp2.setHeight(10);
            temp2.setX(i);
            temp2.setY(0);
            zero.getChildren().add(temp2);
        }
        return zero;
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
            if (maxX(a,v)>120) {
                System.out.println("hejdå");
                graphics gp = new graphics();

                windo = drawBagrund(windo, 250);
                for (double t = 0.01; t < 100; t = t + 0.01) {
                    vacuumThrow vt = new vacuumThrow(1);
                    windo = gp.drawBow(windo,vt.calkulatX(v,a,t),vt.calkulatY(v,a,t));
                }


            }else if (maxX(a,v)<120) {
                System.out.println("hej");
                windo = drawBagrund2(windo, 120);
                Scale scale = new Scale();
                scale.setX(2);
                scale.setY(2);
                scale.setPivotX(125);
                scale.setPivotY(70);
                windo.getTransforms().addAll(scale);
                //windo.setScaleX(2);
                //windo.setScaleY(2);

                for (double t = 0.01; t < 100; t = t + 0.01) {
                    windo = drawBow(windo, v, a, t);

                }

            }

            border.add(windo, 1, 0);
        }
    }
    public void transform(double x,double y){

    }

}
