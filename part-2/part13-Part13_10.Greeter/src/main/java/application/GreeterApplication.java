package application;

import com.sun.javafx.scene.control.LabeledImpl;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.crypto.AEADBadTagException;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane layout = new GridPane();
        StackPane welcomeScreen = new StackPane();
        Label infoLabel = new Label("Enter your name and start.");
        Label nameLabel = new Label("Welcome ");
        TextField textField = new TextField();
        Button start = new Button("start");

        Scene window = new Scene(layout);
        Scene welcome = new Scene(welcomeScreen);

        layout.add(infoLabel, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(start, 0, 2);
        layout.setAlignment(Pos.CENTER);
        layout.setPrefSize(300, 180);
        welcomeScreen.getChildren().add(nameLabel);

        start.setOnAction((event) -> {
            nameLabel.setText("Welcome " + textField.getText() + "!");
            stage.setScene(welcome);
        });
        
        
        stage.setScene(window);
        stage.show();
    }
}
