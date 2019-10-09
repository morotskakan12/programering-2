import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class StartPage extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }

    String number = "";
    TextField text = new TextField();
    Button knap1 = new Button(" 1 ");
    Button knap2 = new Button(" 2 ");
    Button knap3 = new Button(" 3 ");

    Button knap4 = new Button(" 4 ");
    Button knap5 = new Button(" 5 ");
    Button knap6 = new Button(" 6 ");

    Button knap7 = new Button(" 7 ");
    Button knap8 = new Button(" 8 ");
    Button knap9 = new Button(" 9 ");

    Button knapD = new Button(" / ");
    Button knapP = new Button(" + ");
    Button knapM = new Button(" - ");
    Button knapMM = new Button(" * ");

    Button knap0 = new Button(" 0 ");
    Button knapCler = new Button(" clar ");
    Button knapAnser = new Button(" = ");

    ArrayList<Button> numpad = new ArrayList<Button>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane border = new BorderPane();
        HBox hboxTop = new HBox();
        HBox hbox = new HBox();
        VBox vbox = new VBox();
        VBox vbox2 = new VBox();
        VBox vbox3 = new VBox();
        VBox vbox4 = new VBox();

        vbox2.getChildren().addAll(knap4, knap5, knap6, knap0);
        vbox3.getChildren().addAll(knap7, knap8, knap9, knapAnser);
        vbox.getChildren().addAll(knap1, knap2, knap3, knapCler);
        vbox4.getChildren().addAll(knapD, knapMM, knapM, knapP);
        text.setBackground(new Background(new BackgroundFill(Color.rgb(220, 0, 20), CornerRadii.EMPTY, Insets.EMPTY)));
        text.setPrefSize(150, 80);
        text.setAlignment(Pos.CENTER);
        knap1.setOnAction(this);
        knap2.setOnAction(this);
        knap3.setOnAction(this);
        knap4.setOnAction(this);
        knap5.setOnAction(this);
        knap6.setOnAction(this);
        knap7.setOnAction(this);
        knap8.setOnAction(this);
        knap9.setOnAction(this);
        knapP.setOnAction(this);
        knapD.setOnAction(this);
        knapMM.setOnAction(this);
        knapM.setOnAction(this);
        knap0.setOnAction(this);
        knapCler.setOnAction(this);
        knapAnser.setOnAction(this);

        hboxTop.getChildren().add(text);

        hbox.getChildren().addAll(vbox, vbox2, vbox3, vbox4);

        border.setTop(hboxTop);
        border.setCenter(hbox);

        Scene scene = new Scene(border, 600, 350);

        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == knap1) {
            number = number + "1";
            text.setText(number);
        }
        if (event.getSource() == knap2) {
            number = number + "2";
            text.setText(number);
        }
        if (event.getSource() == knap3) {
            number = number + "3";
            text.setText(number);
        }
        if (event.getSource() == knap4) {
            number = number + "4";
            text.setText(number);
        }
        if (event.getSource() == knap5) {
            number = number + "5";
            text.setText(number);
        }
        if (event.getSource() == knap6) {
            number = number + "6";
            text.setText(number);
        }
        if (event.getSource() == knap7) {
            number = number + "7";
            text.setText(number);
        }
        if (event.getSource() == knap8) {
            number = number + "8";
            text.setText(number);
        }
        if (event.getSource() == knap9) {
            number = number + "9";
            text.setText(number);
        }
        if (event.getSource() == knapP) {
            number = number + "+";
            text.setText(number);
        }
        if (event.getSource() == knapM) {
            number = number + "-";
            text.setText(number);
        }
        if (event.getSource() == knapD) {
            number = number + "/";
            text.setText(number);
        }
        if (event.getSource() == knapMM) {
            number = number + "x";
            text.setText(number);
        }
        if (event.getSource() == knap0) {
            number = number + "0";
            text.setText(number);
        }
        if (event.getSource() == knapCler) {
            number = "";
            text.setText(number);
        }
        if (event.getSource() == knapAnser) {
            number = "detta är lika med något";
            text.setText(number);
            number = "";
        }
    }

    public void test() {

        char[] teken = {'1','2','3','4','5','6','7','8','9','0',',','+','-','/','*'};
        for (char t : teken) {
            Button temp = new Button("" + t);
            temp.setOnAction(event -> {});
            numpad.add(temp);
        }


    }
}

