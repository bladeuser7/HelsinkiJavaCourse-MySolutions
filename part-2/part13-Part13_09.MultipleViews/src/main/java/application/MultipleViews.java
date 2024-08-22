package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane firstView = new BorderPane();
        VBox secondView = new VBox();
        GridPane thirdView = new GridPane();
        Button firstButton = new Button("To the second view!");
        Button secondButton = new Button("To the third View");
        Button thirdButton = new Button("To the first view!");

        Scene window = new Scene(firstView);
        Scene window2 = new Scene(secondView);
        Scene window3 = new Scene(thirdView);

        firstView.setTop(new Label("First view!"));
        firstView.setCenter(firstButton);

        firstButton.setOnAction((event) -> {
            stage.setScene(window2);
        });

        secondView.getChildren().addAll( secondButton, new Label("Second view!"));

        secondButton.setOnAction((event) -> {
            stage.setScene(window3);
        });

        thirdView.add(new Label("Third view!"), 0, 0);
        thirdView.add(thirdButton, 1, 1);

        thirdButton.setOnAction((event) -> {
            stage.setScene(window);
        });

        stage.setScene(window);
        stage.show();

    }

}
