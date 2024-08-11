package textstatistics;

import java.util.Arrays;
import javafx.scene.control.TextArea;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.event.ChangeListener;

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
        Label charactersLabel = new Label("Letters: " );
        Label wordsLabel = new Label("Words: ");
        Label longestLabel = new Label("The longest word is: ");

        horizon.setSpacing(10);

        textField.textProperty().addListener((change, oldValue, newValue) -> {
            System.out.println(oldValue + " -> " + newValue);
            textField.setText(newValue);
        });

        textField.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            charactersLabel.setText(String.valueOf(characters));
            String[] parts = newValue.split(" ");
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            charactersLabel.setText("Letters: " + characters);
            wordsLabel.setText("Words: " + String.valueOf(parts.length));
            longestLabel.setText("The longest word is: " + longest);

        });

        layout.setCenter(textField);
        layout.setBottom(horizon);
        horizon.getChildren().addAll(charactersLabel, wordsLabel, longestLabel);

        Scene view = new Scene(layout);

        stage.setScene(view);

        stage.show();

    }
}
