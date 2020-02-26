package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static sample.metoder.toVaribolArryList;

public class StartPage extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }

    String number = "";
    TextField textOutPot = new TextField();
    Button buttonVaribol = new Button("addVaribol");
    Button buttonRow = new Button("addRow");
    Button buttonCler = new Button(" clear ");
    Button button = new Button(" = ");
    Button buttonAnser = new Button("calulat");
    GridPane buttonContainer = new GridPane();
    ArrayList<Button> numpad = new ArrayList<Button>();
    TableView table = new TableView();
    int varibolNumber = 0;
    ArrayList<String> RowMatris = new ArrayList<String>();
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

        buttonVaribol.setOnAction(this);
        buttonRow.setOnAction(this);
        buttonCler.setOnAction(this);
        buttonAnser.setOnAction(this);
        button.setOnAction(this);

        buttonContainer.add(buttonVaribol,5,0);
        buttonContainer.add(buttonRow,5,1);
        buttonContainer.add(buttonAnser,5,2);
        buttonContainer.add(buttonCler,5,3);
        buttonContainer.add(button,6,0);

        buttonAnser.setPrefSize(75,50);
        button.setPrefSize(50,50);
        buttonCler.setPrefSize(50,50);
        buttonVaribol.setPrefSize(75,50);
        buttonRow.setPrefSize(75,50);

        final Label label = new Label("Matris");
        label.setFont(new Font("Arial", 20));
        table.setEditable(true);


        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        toptextfield.getChildren().add(textOutPot);
        border.add(toptextfield,0,0);
        border.add(buttonContainer,0,1);
        border.add(vbox,1,1);


        Scene scene = new Scene(border);

        primaryStage.setResizable(false);
        primaryStage.setTitle("fy fan vad göt");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {

        if(event.getSource()== button){
            number = number + "=";
            textOutPot.setText(number);
        }

        if(event.getSource()== buttonVaribol){

            number = number + metoder.varibol(varibolNumber);
            textOutPot.setText(number);
            varibolNumber++;
        }

        if(event.getSource()== buttonRow){
            RowMatris.add(number);
            tablestor();
            number = "";
            textOutPot.setText(number);
            System.out.println(RowMatris.get(0));
        }
        if (event.getSource() == buttonCler) {
            number = "";
            varibolNumber = 0;
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
        for(int indexVågrät = 0; indexVågrät < 3;indexVågrät++ ){
            for(int indexLodrät = 0; indexLodrät < 4;indexLodrät++ ){
                buttonContainer.add(numpad.get(indexKnap),indexVågrät,indexLodrät);
                indexKnap++;
                if(indexKnap == numpad.size()){
                    break;
                }
            }
        }
    }
    public void tablestor(){
        ArrayList<Character> varibol = new ArrayList<Character>();
         varibol = toVaribolArryList(number);

        for (char t : varibol) {
            TableColumn temp = new TableColumn("" + t);
            table.getColumns().add(temp);

            }
        TableColumn temp = new TableColumn("=");
        table.getColumns().add(temp);
        }

    public void buttonStor() {

        char[] numarry = {'1','4','7','2','5','8','3','6','9','0','+','-'};
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

