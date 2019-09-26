import com.sun.glass.ui.Menu;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;

import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.awt.*;


public class StartPage extends Application implements EventHandler<ActionEvent> {
	Button italien = new Button("italien");
	Button schweiz = new Button("schweiz");
	Button irland = new Button("irland");
	Button frankrike = new Button("frankrike");
	Button sverge = new Button("sverge");
	BorderPane border = new BorderPane();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}



	@Override
	public void start(Stage primaryStage) throws Exception

	{


		HBox hbox = addHBox();
		border.setTop(hbox);


		frankrike.setOnAction(this);
		schweiz.setOnAction(this);
		irland.setOnAction(this);
		italien.setOnAction(this);
		sverge.setOnAction(this);

		Scene scene = new Scene(border, 600, 350, Color.RED);
		primaryStage.setTitle("fy fan vad göt");
		primaryStage.setScene(scene);

		primaryStage.show();
	}



	public HBox addHBox() {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(10);
		hbox.setStyle("-fx-background-color: #336699;");


		sverge.setPrefSize(110, 20);

		frankrike.setPrefSize(110, 20);

		irland.setPrefSize(110, 20);

		italien.setPrefSize(110, 20);

		schweiz.setPrefSize(110, 20);

		hbox.getChildren().addAll(sverge, frankrike,irland,italien,schweiz);
		return hbox;
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == sverge){
			border.setCenter(FlaggaFyra.createFlagFyra(new Group()));
			border.setBackground(new Background(new BackgroundFill(Color.rgb(40, 0, 220), CornerRadii.EMPTY, Insets.EMPTY)));

		}
		if (event.getSource() == frankrike){
			border.setCenter(Flagga.createFlag(new Group()));
			border.setBackground(new Background(new BackgroundFill(Color.rgb(220, 220, 220), CornerRadii.EMPTY, Insets.EMPTY)));
		}
		if (event.getSource() == irland){
			border.setCenter(FlaggaTvå.createFlagTvå(new Group()));
			border.setBackground(new Background(new BackgroundFill(Color.rgb(220, 220, 220), CornerRadii.EMPTY, Insets.EMPTY)));
		}
		if (event.getSource() == italien){
			border.setCenter(FlaggaTre.createFlagTre(new Group()));
			border.setBackground(new Background(new BackgroundFill(Color.rgb(220, 220, 220), CornerRadii.EMPTY, Insets.EMPTY)));
		}
		if (event.getSource() == schweiz){
			border.setCenter(FlaggaFem.createFlagFem(new StackPane()));
			border.setBackground(new Background(new BackgroundFill(Color.rgb(220, 0, 20), CornerRadii.EMPTY, Insets.EMPTY)));
		}
	}
}