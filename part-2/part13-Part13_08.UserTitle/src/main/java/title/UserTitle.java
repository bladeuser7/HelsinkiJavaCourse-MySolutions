package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {
//
//    private String title;
//
//    public UserTitle(String title) {
//        this.title = title;
//    }

    @Override
    public void start(Stage stage) throws Exception {
        Parameters params = getParameters();
        String titles = params.getNamed().get("title");

        stage.setTitle(titles);
        stage.show();
    }

}
