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

  /*  Button knap1 = new Button(" 1 ");
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

    Button knap0 = new Button(" 0 ");*/
    Button knapCler = new Button(" clar ");
    Button knapAnser = new Button(" = ");
    GridPane buten = new GridPane();
    ArrayList<Button> numpad = new ArrayList<Button>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane border = new BorderPane();
        HBox hboxTop = new HBox();
        HBox hbox = new HBox();
        VBox vbox = new VBox();
        HBox vbox2 = new HBox();
        VBox vbox3 = new VBox();
        VBox vbox4 = new VBox();
        setButten();
        buten.getChildren();

        vbox2.getChildren().addAll(knapAnser,knapCler);
        /*vbox3.getChildren().addAll(knap7, knap8, knap9, );
        vbox.getChildren().addAll(knap1, knap2, knap3, knapCler);
        vbox4.getChildren().addAll(knapD, knapMM, knapM, knapP);*/
        text.setBackground(new Background(new BackgroundFill(Color.rgb(220, 0, 20), CornerRadii.EMPTY, Insets.EMPTY)));
        text.setPrefSize(150, 80);
        text.setAlignment(Pos.CENTER);
      /*  knap1.setOnAction(this);
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
        knap0.setOnAction(this);*/
        knapCler.setOnAction(this);
        knapAnser.setOnAction(this);

        hboxTop.getChildren().add(text);

        hbox.getChildren().addAll(vbox, vbox2, vbox3, vbox4);

        border.setTop(hboxTop);
        border.setCenter(buten);
        border.setBottom(vbox2);
        Scene scene = new Scene(border, 600, 350);

        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {

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
    public void setButten(){
       int indexKnap = 0 ;
        for(int indexVågrät = 1; indexVågrät < 6;indexVågrät++ ){
            for(int indexLodrät = 1; indexLodrät < 4;indexLodrät++ ){
                buten.add(numpad.get(indexKnap),indexVågrät,indexLodrät);
            if(indexKnap == numpad.size()){
                break;
            }
            }
        }
    }
    public void buttenStor() {

        char[] teken = {'1','2','3','4','5','6','7','8','9','0',',','+','-','/','*'};
        for (char t : teken) {
            Button temp = new Button("" + t);
            temp.setOnAction(event -> {
                number = number+ "" + t;
                text.setText(number);

            });
            numpad.add(temp);
        }


    }
}

