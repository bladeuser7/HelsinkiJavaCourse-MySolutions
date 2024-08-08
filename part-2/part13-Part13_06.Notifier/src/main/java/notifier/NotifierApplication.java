package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        TextField myField = new TextField();
        Button myButton = new Button("update");
        Label myLabel = new Label();
        VBox componetntGroup = new VBox();
        
        
        myButton.setOnAction((event) -> {
        myLabel.setText(myField.getText());
    });

        componetntGroup.setSpacing(20);
        componetntGroup.getChildren().addAll(myField, myButton, myLabel);
        
        
        Scene viewport = new Scene(componetntGroup);
        stage.setScene(viewport);
        stage.show();
        
        


    }

}
