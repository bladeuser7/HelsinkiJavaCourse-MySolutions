package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage) {
        TextField myText = new TextField("text");
        Button myButton = new Button("button");

        FlowPane myFlowPane = new FlowPane();
        myFlowPane.getChildren().add(myButton);
        myFlowPane.getChildren().add(myText);

        
        Scene componentGroup  = new Scene(myFlowPane);
        stage.setScene(componentGroup );
        stage.show();
     
    
    }

}
