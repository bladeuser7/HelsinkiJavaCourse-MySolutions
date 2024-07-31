package textstatistics;

import java.awt.TextComponent;
import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        TextArea textField = new TextArea();
        HBox horizon = new HBox();
        horizon.setSpacing(10);

        layout.setCenter(new TextArea());
        layout.setBottom(horizon);
        horizon.getChildren().add(new Label("Letters: 0"));
        horizon.getChildren().add(new Label("Words: 0"));
        horizon.getChildren().add(new Label("The longest word is:"));
        
        Scene view  = new Scene(layout);
        stage.setScene(view);
        stage.show();

    }

}
