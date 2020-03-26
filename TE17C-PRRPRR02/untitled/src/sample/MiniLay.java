package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;

import java.util.function.UnaryOperator;

public class MiniLay<textFormatter> extends Application implements EventHandler<ActionEvent> {

    MiniNum miniNum = new MiniNum(this);

    public static void main(String[] args) {
        launch(args);
    }
    TextField field = new TextField();
    Font font = new Font("SansSerif", 30);
    Font font2 = new Font("SansSerif", 20);
    Button bPlus;
    Button bMinus;
    Button bMulti;
    Button bDela;
    Button bComma;
    Button bLika;
    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Stage stage;
    Scene scene;
    BorderPane mainLayout;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage=primaryStage;

        bComma = new Button(",");
        bComma.setOnAction(this::handle);
        bComma.setMinSize(75, 75);
        bComma.setFont(font);
        b0 = new Button("0");
        b0.setOnAction(this::handle);
        b0.setMinSize(75, 75);
        b0.setFont(font);
        bLika = new Button("=");
        bLika.setOnAction(this::handle);
        bLika.setMinSize(75, 75);
        bLika.setFont(font);
        bDela = new Button("÷");
        bDela.setOnAction(this::handle);
        bDela.setMinSize(75, 75);
        bDela.setFont(font);

        b1 = new Button("1");
        b1.setOnAction(this::handle);
        b1.setMinSize(75, 75);
        b1.setFont(font2);
        b2 = new Button("2");
        b2.setOnAction(this::handle);
        b2.setMinSize(75, 75);
        b2.setFont(font2);
        b3 = new Button("3");
        b3.setOnAction(this::handle);
        b3.setMinSize(75, 75);
        b3.setFont(font2);
        bPlus = new Button("+");
        bPlus.setOnAction(this::handle);
        bPlus.setMinSize(75, 75);
        bPlus.setFont(font);

        b4 = new Button("4");
        b4.setOnAction(this::handle);
        b4.setMinSize(75, 75);
        b4.setFont(font2);
        b5 = new Button("5");
        b5.setOnAction(this::handle);
        b5.setMinSize(75, 75);
        b5.setFont(font2);
        b6 = new Button("6");
        b6.setOnAction(this::handle);
        b6.setMinSize(75, 75);
        b6.setFont(font2);
        bMinus = new Button("-");
        bMinus.setOnAction(this::handle);
        bMinus.setMinSize(75, 75);
        bMinus.setFont(font);

        b7 = new Button("7");
        b7.setOnAction(this::handle);
        b7.setMinSize(75, 75);
        b7.setFont(font2);
        b8 = new Button("8");
        b8.setOnAction(this::handle);
        b8.setMinSize(75, 75);
        b8.setFont(font2);
        b9 = new Button("9");
        b9.setOnAction(this::handle);
        b9.setMinSize(75, 75);
        b9.setFont(font2);
        bMulti = new Button("*");
        bMulti.setOnAction(this::handle);
        bMulti.setMinSize(75, 75);
        bMulti.setFont(font);

        mainLayout = new BorderPane();

        HBox box1 = new HBox(b1, b2, b3, bPlus);
        box1.setMinSize(75, 75);
        HBox box2 = new HBox(b4, b5, b6, bMinus);
        box2.setMinSize(75, 75);
        HBox box3 = new HBox(b7, b8, b9, bMulti);
        box3.setMinSize(75, 75);
        HBox box4 = new HBox(bComma, b0, bLika, bDela);
        box4.setMinSize(75, 75);

        VBox box = new VBox(box1,box2,box3,box4);
        box.setMinSize(300, 300);
        mainLayout.setCenter(box);
        // tillåter ine använderen skriva något annat än det som finns på knapparna
        field.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    field.setText(newValue.replaceAll("[^\\d,+,.,=,*,÷,-]", ""));
                }
            }
        });
        field.setMinSize(300, 50);
        mainLayout.setTop(field);

        //Creating a scene object
        scene = new Scene(mainLayout, 300, 350);
        //Setting title to the Stage
        stage.setTitle("Miniräknare");

        stage.setScene(scene);

        stage.show();
    }
    @Override
    public void handle(ActionEvent event) {
        if(event.getSource().equals(b0))
        {
            field.textProperty().set(field.textProperty().get() + "0");
        }
        if(event.getSource().equals(b1))
        {
            field.textProperty().set(field.textProperty().get() + "1");
        }
        if(event.getSource().equals(b2))
        {
            field.textProperty().set(field.textProperty().get() + "2");
        }
        if(event.getSource().equals(b3))
        {
            field.textProperty().set(field.textProperty().get() + "3");
        }
        if(event.getSource().equals(b4))
        {
            field.textProperty().set(field.textProperty().get() + "4");
        }
        if(event.getSource().equals(b5))
        {
            field.textProperty().set(field.textProperty().get() + "5");
        }
        if(event.getSource().equals(b6))
        {
            field.textProperty().set(field.textProperty().get() + "6");
        }
        if(event.getSource().equals(b7))
        {
            field.textProperty().set(field.textProperty().get() + "7");
        }
        if(event.getSource().equals(b8))
        {
            field.textProperty().set(field.textProperty().get() + "8");
        }
        if(event.getSource().equals(b9))
        {
            field.textProperty().set(field.textProperty().get() + "9");
        }
        if(event.getSource().equals(bComma))
        {
            field.textProperty().set(field.textProperty().get() + ".");
        }
        if(event.getSource().equals(bLika))
        {
            miniNum.lika();
        }
        if(event.getSource().equals(bPlus))
        {
            miniNum.plus();
        }
        if(event.getSource().equals(bMinus))
        {
            miniNum.minus();
        }
        if(event.getSource().equals(bMulti))
        {
            miniNum.multi();
        }
        if(event.getSource().equals(bDela))
        {
            miniNum.dela();
        }
    }


}
