package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private Integer turn;
    private Button zeroZero;
    private Button zeroOne;
    private Button zeroTwo;
    private Button oneZero;
    private Button oneOne;
    private Button oneTwo;
    private Button twoZero;
    private Button twoOne;
    private Button twoTwo;

    public TicTacToeApplication() {
        this.turn = 0;
        this.oneOne = new Button(" ");
        this.oneTwo = new Button(" ");
        this.oneZero = new Button(" ");
        this.twoOne = new Button(" ");
        this.twoTwo = new Button(" ");
        this.twoZero = new Button(" ");
        this.zeroOne = new Button(" ");
        this.zeroTwo = new Button(" ");
        this.zeroZero = new Button(" ");

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane layout = new GridPane();
        BorderPane info = new BorderPane();
        Label turnIndicator = new Label("Turn: X");
        info.setTop(turnIndicator);

        turnIndicator.setFont(Font.font("Monospaced", 80));

        info.setCenter(layout);

        info.setPadding(new Insets(20, 20, 20, 20));
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setHgap(100);
        layout.setVgap(100);

        layout.add(zeroZero, 0, 0);
        layout.add(zeroOne, 0, 1);
        layout.add(zeroTwo, 0, 2);
        layout.add(oneZero, 1, 0);
        layout.add(oneOne, 1, 1);
        layout.add(oneTwo, 1, 2);
        layout.add(twoZero, 2, 0);
        layout.add(twoOne, 2, 1);
        layout.add(twoTwo, 2, 2);
        
        

        Scene view = new Scene(info, 800, 800);
        stage.setScene(view);
        stage.show();
        System.out.println(checkForWinner());

        zeroOne.setOnAction((event) -> {
            if (zeroOne.getText().isBlank() && !checkForWinner()) {
                setButtonText(zeroOne);
                swapLabel(turnIndicator);
                if (checkForWinner()) {
                    turnIndicator.setText("The end!");
                }
            }
        });
        oneOne.setOnAction((event) -> {
            if (oneOne.getText().isBlank() && !checkForWinner()) {
                setButtonText(oneOne);
                swapLabel(turnIndicator);
                if (checkForWinner()) {
                    turnIndicator.setText("The end!");
                }
            }
        });
        twoOne.setOnAction((event) -> {
            if (twoOne.getText().isBlank() && !checkForWinner()) {
                setButtonText(twoOne);
                swapLabel(turnIndicator);
                if (checkForWinner()) {
                    turnIndicator.setText("The end!");
                }
            }
        });
        zeroZero.setOnAction((event) -> {
            if (zeroZero.getText().isBlank() && !checkForWinner()) {
                setButtonText(zeroZero);
                swapLabel(turnIndicator);
                if (checkForWinner()) {
                    turnIndicator.setText("The end!");
                }
            }
        });
        zeroTwo.setOnAction((event) -> {
            if (zeroTwo.getText().isBlank() && !checkForWinner()) {
                setButtonText(zeroTwo);
                swapLabel(turnIndicator);
                if (checkForWinner()) {
                    turnIndicator.setText("The end!");
                }
            }
        });
        oneTwo.setOnAction((event) -> {
            if (oneTwo.getText().isBlank() && !checkForWinner()) {
                setButtonText(oneTwo);
                swapLabel(turnIndicator);
                if (checkForWinner()) {
                    turnIndicator.setText("The end!");
                }
            }
        });
        oneZero.setOnAction((event) -> {
            if (oneZero.getText().isBlank() && !checkForWinner()) {
                setButtonText(oneZero);
                swapLabel(turnIndicator);
                if (checkForWinner()) {
                    turnIndicator.setText("The end!");
                }
            }
        });
        twoZero.setOnAction((event) -> {
            if (twoZero.getText().isBlank() && !checkForWinner()) {
                setButtonText(twoZero);
                swapLabel(turnIndicator);
                if (checkForWinner()) {
                    turnIndicator.setText("The end!");
                }
            }
        });
        twoTwo.setOnAction((event) -> {
            if (twoTwo.getText().isBlank() && !checkForWinner()) {
                setButtonText(twoTwo);
                swapLabel(turnIndicator);
                if (checkForWinner()) {
                    turnIndicator.setText("The end!");
                }
            }
        });
    }

    public void setButtonText(Button button) {
        if (this.turn == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        System.out.println(button.getLayoutX());
        System.out.println(button.getLayoutY());
    }

    public void swapLabel(Label pane) {
        if (this.turn == 0) {
            pane.setText("Turn: O");
            this.turn = 1;
        } else if (this.turn == 1) {
            pane.setText("Turn: X");
            this.turn = 0;
        }
    }

    public boolean checkForWinner() {
        if (zeroOne.getText().equals(zeroTwo.getText()) && zeroTwo.getText().equals(zeroZero.getText()) && !zeroOne.getText().equals(" ")) {
            return true;
        }
        if (oneOne.getText().equals(oneTwo.getText()) && oneTwo.getText().equals(oneZero.getText()) && !oneOne.getText().equals(" ")) {
            return true;
        }
        if (twoOne.getText().equals(twoTwo.getText()) && twoTwo.getText().equals(twoZero.getText()) && !twoOne.getText().equals(" ")) {
            return true;
        }
        if (zeroZero.getText().equals(oneOne.getText()) && zeroZero.getText().equals(twoTwo.getText()) && !zeroZero.getText().equals(" ")) {
            return true;
        }
        if (twoZero.getText().equals(oneOne.getText()) && twoZero.getText().equals(zeroTwo.getText()) && !twoZero.getText().equals(" ")) {
            return true;
        }
        if (zeroTwo.getText().equals(zeroOne.getText()) && zeroOne.getText().equals(zeroZero.getText()) && !zeroTwo.getText().equals(" ")) {
            return true;
        }
        if (oneTwo.getText().equals(oneOne.getText()) && oneOne.getText().equals(oneZero.getText()) && !oneTwo.getText().equals(" ")) {
            return true;
        }
        if (twoTwo.getText().equals(twoOne.getText()) && twoOne.getText().equals(twoZero.getText()) && !twoTwo.getText().equals(" ")) {
            return true;
        }
        return false;
    }
}
