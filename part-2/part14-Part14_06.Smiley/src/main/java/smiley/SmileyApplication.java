package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        Canvas whileboard = new Canvas(640, 480);
        GraphicsContext paint = whileboard.getGraphicsContext2D();
        ColorPicker colorPalette = new ColorPicker(Color.BLACK);

        layout.setCenter(whileboard);

        paint.setFill(colorPalette.getValue());
        paint.fillOval(50, 50, 50, 50);
        paint.fillOval(200, 50, 50, 50);

        paint.fillOval(30, 200, 50, 50);
        paint.fillOval(220, 200, 50, 50);

        paint.fillOval(50, 220, 50, 50);
        paint.fillOval(180, 220, 50, 50);

        paint.fillOval(70, 220, 50, 50);
        paint.fillOval(160, 220, 50, 50);

        paint.fillOval(90, 220, 50, 50);
        paint.fillOval(140, 220, 50, 50);
        
                paint.fillOval(120, 220, 50, 50);


        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();

    }

}
