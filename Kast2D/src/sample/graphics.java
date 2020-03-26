
package sample;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;


public class graphics {
    public Pane drawBagrund (Pane zero, int setSkal){
        for(int i =0;i<setSkal;i=i+10){

            Rectangle temp = new Rectangle();
            temp.setWidth(5);
            temp.setHeight(10);
            temp.setX(i);
            temp.setY(0);
            zero.getChildren().add(temp);
        }
        zero.setStyle("-fx-background-color: GREEN;");

        return zero;
    }
    public Pane drawBowRed(Pane zero, double x,double y) {
        Circle temp = new Circle();
        temp.setFill(Color.RED);
        temp.setRadius(2);
        temp.setCenterX(x);
        temp.setCenterY(y);
        zero.getChildren().add(temp);


        return zero;
    }
    public Pane drawBowBlue(Pane zero, double x,double y) {
        Circle temp = new Circle();
        temp.setFill(Color.BLUE);
        temp.setRadius(2);
        temp.setCenterX(x);
        temp.setCenterY(y);
        zero.getChildren().add(temp);


        return zero;
    }
    public Pane scale (Pane windo, double setskal) {
        Scale scale = new Scale();
        scale.setX(setskal);
        scale.setY(setskal);
        scale.setPivotX(0);
        scale.setPivotY(50);

        windo.getTransforms().addAll(scale);

        return windo;
    }
    public VBox setText (VBox maxOf, Text maxOfX,Text maxOfY,Double v,Double a){

        maxOf.getChildren().clear();
        maxOfX.setText( "Max Valu of X"+" "+(Double.toString((float)maxValu.calkulatXmax(v,a))));
        maxOfY.setText( "Max Valu of Y"+" "+(Double.toString((float)maxValu.calkulatYmax(v,a))));

        maxOf.getChildren().addAll(maxOfX,maxOfY);
        return maxOf;
    }
    public GridPane gridclear(GridPane bordeer){
        bordeer.getChildren().clear();
        return bordeer;
    }
    public Pane paneClear(Pane windo){
        windo.getChildren().clear();
        windo.getTransforms().clear();


        return windo;
    }
}