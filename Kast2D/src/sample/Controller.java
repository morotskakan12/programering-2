package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Controller extends Application implements EventHandler<ActionEvent> {
    GridPane border = new GridPane();
    TextField text = new TextField();
    GridPane windo = new GridPane();
    VBox conterner = new VBox();
    Button enter = new Button("Enter");
    @Override
    public void start(Stage primaryStage) throws Exception {
        windo.setPrefSize(200,250);

        windo.setBackground(new Background(new BackgroundFill(Color.rgb(0, 222, 0), CornerRadii.EMPTY, Insets.EMPTY)));

        text.setPrefSize(50,200);

        conterner.getChildren().addAll(text,enter);
        enter.setOnAction(this);
        border.add(conterner,1,1);
        border.add(windo,2,1);
        Scene scene = new Scene(border, 250, 250);

        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
    public static GridPane drawBow(GridPane zero,int i){
         zero.setPrefSize(500,250);
            Circle temp = new Circle();
            temp.setFill(Color.RED);
            temp.setRadius(10);
            temp.setCenterX(i);
            temp.setCenterY(i);
            zero.getChildren().add(temp);

        return zero;
    }

    @Override
    public void handle(ActionEvent event) {

        if (event.getSource() == enter) {
            int i = 0;
                windo = drawBow(windo,i);
                i=i + 50;
                windo = drawBow(windo,i);
                }

            }


        }
