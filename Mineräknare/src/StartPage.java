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

    Button knapCler = new Button(" clear ");
    Button knapAnser = new Button(" = ");
    GridPane buten = new GridPane();
    ArrayList<Button> numpad = new ArrayList<Button>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane border = new BorderPane();
        HBox hboxTop = new HBox();

        HBox hbox2 = new HBox();
        buttenStor();
        setButten();
        buten.getChildren();

        hbox2.getChildren().addAll(knapAnser,knapCler);

        text.setBackground(new Background(new BackgroundFill(Color.rgb(146, 146, 146), CornerRadii.EMPTY, Insets.EMPTY)));
        text.setPrefSize(250, 80);
        text.setAlignment(Pos.CENTER);

        knapCler.setOnAction(this);
        knapAnser.setOnAction(this);
        buten.add(knapAnser,1,6);
        buten.add(knapCler,2,6);
        knapAnser.setPrefSize(50,50);
        knapCler.setPrefSize(50,50);
        hboxTop.getChildren().add(text);



        border.setTop(hboxTop);
        border.setCenter(buten);

        Scene scene = new Scene(border, 250, 200);

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
            mineräknare m = new mineräknare();
            number = number.valueOf(m.matte(number)) ;
            text.setText(number);
            number = "";
        }
    }
    public void setButten(){
       int indexKnap = 0 ;
        for(int indexVågrät = 1; indexVågrät < 6;indexVågrät++ ){
            for(int indexLodrät = 1; indexLodrät < 4;indexLodrät++ ){
                buten.add(numpad.get(indexKnap),indexVågrät,indexLodrät);
                indexKnap++;
                if(indexKnap == numpad.size()){
                    break;
                }
            }
        }
    }
    public void buttenStor() {

        char[] teken = {'1','2','3','4','5','6','7','8','9','0','.','+','-','/','*'};
        for (char t : teken) {
            Button temp = new Button("" + t);
            temp.setPrefSize(50,50);
            temp.setOnAction(event -> {
                number = number+ "" + t;
                text.setText(number);

            });
            numpad.add(temp);
        }


    }
}

