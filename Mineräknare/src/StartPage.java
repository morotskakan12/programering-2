import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
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
    TextField textOutPot = new TextField();
    Button buttonProsent = new Button("%");
    Button buttonCler = new Button(" clear ");
    Button buttonAnser = new Button(" = ");
    GridPane buttonContainer = new GridPane();
    ArrayList<Button> numpad = new ArrayList<Button>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane border = new GridPane();
        HBox toptextfield = new HBox();
        HBox operatorBottens = new HBox();
        buttonStor();
        setButten();
        operatorBottens.getChildren().addAll(buttonCler,buttonAnser);
        buttonContainer.getChildren();

        textOutPot.setBackground(new Background(new BackgroundFill(Color.rgb(146, 146, 146), CornerRadii.EMPTY, Insets.EMPTY)));
        textOutPot.setPrefSize(250, 80);
        textOutPot.setAlignment(Pos.CENTER);

        buttonProsent.setOnAction(this);
        buttonCler.setOnAction(this);
        buttonAnser.setOnAction(this);

        buttonContainer.add(buttonProsent,5,0);
        buttonContainer.add(buttonAnser,5,2);
        buttonContainer.add(buttonCler,5,3);

        buttonAnser.setPrefSize(50,50);
        buttonCler.setPrefSize(50,50);
        buttonProsent.setPrefSize(50,50);



        toptextfield.getChildren().add(textOutPot);
        border.add(toptextfield,1,0);
        border.add(buttonContainer,1,1);

        border.maxHeight(250);
        border.maxWidth(200);
        Scene scene = new Scene(border,240,250);

        primaryStage.setResizable(false);
        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {

        if(event.getSource()== buttonProsent){
            number = number + "%";
            textOutPot.setText(number);
        }
        if (event.getSource() == buttonCler) {
            number = "";
            textOutPot.setText(number);
        }
        if (event.getSource() == buttonAnser) {
            mineräknare m = new mineräknare();
            number = number.valueOf(m.matte(number)) ;

            textOutPot.setText(number);
            number = "";
        }
        if (event.getSource() ==   KeyEvent.KEY_PRESSED){
            textOutPot.setText(number);
        }
    }
    public void setButten(){
       int indexKnap = 0 ;
        for(int indexVågrät = 0; indexVågrät < 4;indexVågrät++ ){
            for(int indexLodrät = 0; indexLodrät < 4;indexLodrät++ ){
                buttonContainer.add(numpad.get(indexKnap),indexVågrät,indexLodrät);
                indexKnap++;
                if(indexKnap == numpad.size()){
                    break;
                }
            }
        }
    }
    public void buttonStor() {

        char[] numarry = {'1','4','7','.','2','5','8','0','3','6','9','+','-','/','*','^'};
        for (char t : numarry) {
            Button temp = new Button("" + t);
            temp.setPrefSize(50,50);
            temp.setOnAction(event -> {
                number = number+ "" + t;
                textOutPot.setText(number);

            });
            numpad.add(temp);
        }


    }
}

