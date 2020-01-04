package sample;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import static java.lang.Math.*;

public class graphics  {
    public Pane drawBagrund (Pane zero, int setSkal){

        for(int i =0;i<setSkal;i=i+10){

            Rectangle temp = new Rectangle();
            temp.setWidth(1);
            temp.setHeight(10);
            temp.setX(i);
            temp.setY(0);
            zero.getChildren().add(temp);
        }
        return zero;
    }
    public Pane drawBow(Pane zero, double x,double y) {

        Circle temp = new Circle();
        temp.setFill(Color.RED);
        temp.setRadius(1);
        temp.setCenterX(x);
        temp.setCenterY(y);
        zero.getChildren().add(temp);


        return zero;
    }
    public Scale scale (Pane windo, double setskal) {
        Scale scale = new Scale();
        scale.setX(setskal);
        scale.setY(setskal);
        scale.setPivotX(125);
        scale.setPivotY(70);
        windo.getTransforms().addAll(scale);
        return scale;
    }
}


