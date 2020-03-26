package sample;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Main extends Application {
    String Numbers = "";
    TextField windowfield = new TextField();
    double numb1 = 0;
    double numb2 = 0;
    String operator = "";

    public void start(Stage stage) throws Exception {
        Button one = new Button("1");
        one.setMinSize(100, 100);
        Button two = new Button("2");
        two.setMinSize(100, 100);
        Button three = new Button("3");
        three.setMinSize(100, 100);
        Button four = new Button("4");
        four.setMinSize(100, 100);
        Button five = new Button("5");
        five.setMinSize(100, 100);
        Button six = new Button("6");
        six.setMinSize(100, 100);
        Button seven = new Button("7");
        seven.setMinSize(100, 100);
        Button eight = new Button("8");
        eight.setMinSize(100, 100);
        Button nine = new Button("9");
        nine.setMinSize(100, 100);
        Button zero = new Button("0");
        zero.setMinSize(100, 100);
        Button plus = new Button();
        plus.setText("+");
        plus.setMinSize(100, 100);
        Button equals = new Button();
        equals.setText("=");
        equals.setMinSize(100, 100);
        Button minus = new Button();
        minus.setText("-");
        minus.setMinSize(100, 100);


        windowfield.setMinSize(430, 550);
        windowfield.setEditable(false); //.setEditable(false) accepterar inte att inputs från tangetbordet i rutan
//fixade felaktig bredd på "windowfield"

        BorderPane border = new BorderPane();

        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setMinSize(430, 550);
//mellanrum och storlek på fönster rutan
        layout.add(one, 0, 1);
        layout.add(two, 1, 1);
        layout.add(three, 2, 1);
        layout.add(plus, 3, 1);
//row 1
        layout.add(four, 0, 2);
        layout.add(five, 1, 2);
        layout.add(six, 2, 2);
        layout.add(minus, 3, 2);
//row 2
        layout.add(seven, 0, 3);
        layout.add(eight, 1, 3);
        layout.add(nine, 2, 3);
        layout.add(equals, 3, 3);
//row 3
        layout.add(zero, 1, 4);
//row 4
        one.setOnAction(event -> {
            numbfield(one.getText());
        });
        two.setOnAction(event -> {
            numbfield(two.getText());
        });
        three.setOnAction(event -> {
            numbfield(three.getText());
        });
        four.setOnAction(event -> {
            numbfield(four.getText());
        });
        five.setOnAction(event -> {
            numbfield(five.getText());
        });
        six.setOnAction(event -> {
            numbfield(six.getText());
        });
        seven.setOnAction(event -> {
            numbfield(seven.getText());
        });
        eight.setOnAction(event -> {
            numbfield(eight.getText());
        });
        nine.setOnAction(event -> {
            numbfield(nine.getText());
        });
        zero.setOnAction(event -> {
            numbfield(zero.getText());
        });
        minus.setOnAction(event -> {
            plusminus(minus.getText());
        });
        plus.setOnAction(event ->{
            plusminus(plus.getText());
        });
        equals.setOnAction(event ->{
            windowfield.setText(calculate()+"");
            Numbers=windowfield.getText();
            numb1=Double.parseDouble(Numbers);
            numb2=0;
        });
        
        border.setTop(windowfield);
        border.setCenter(layout);

        Scene scene = new Scene(border, 430, 550);
        stage.setScene(scene);
        stage.setResizable(false); //fönstret är låst storlek
        stage.show();
    }

    public void numbfield(String s) {
        Numbers += s;
        windowfield.setText(Numbers);
    }
    public void plusminus(String s){
        numb1 = Double.parseDouble(Numbers);
        Numbers="";
        operator=s;
    }
    public double calculate(){
        numb2=Double.parseDouble(Numbers);
        if (operator.equals("+")){
            return numb1 + numb2;
        }else if (operator.equals("-")){
            return numb1 - numb2;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
