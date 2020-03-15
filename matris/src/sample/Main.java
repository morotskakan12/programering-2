package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import java.lang.Math;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scanner c = new Scanner(System.in);
       // String [] abc =["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z","å","ä","ö","."];
        //arry = {};

        double i = Math.sqrt(-1);
        System.out.println(i);
        String text ="hej-jag-hetter-isak.";
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
