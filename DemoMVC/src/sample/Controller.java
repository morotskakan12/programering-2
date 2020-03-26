package sample;

import javafx.scene.shape.Rectangle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;

import javax.xml.bind.annotation.XmlAnyElement;
import java.util.Scanner;

public class Controller {
    @FXML
    Rectangle _rectangel;
    public void initialize(){

        try{
            Scanner heja = new Scanner(System.in);
            int hej = Integer.parseInt(heja.nextLine());
            System.out.println("ja");
        }catch (Exception e){
            System.out.println("nej");
        }
    }

    public void buttenclick(ActionEvent actionEvent) {
        if(_rectangel.getFill() == Color.BLUE){
            _rectangel.setFill(Color.RED);
        }else{
            _rectangel.setFill(Color.BLUE);
        }
    }
}
