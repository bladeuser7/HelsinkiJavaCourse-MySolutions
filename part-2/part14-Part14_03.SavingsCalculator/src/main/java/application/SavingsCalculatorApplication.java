package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart lineChart = new LineChart(xAxis, yAxis);
        VBox vertical = new VBox();
        BorderPane subPaneTop = new BorderPane();
        BorderPane subPaneBottom = new BorderPane();
        Slider monthlySavings = new Slider(25, 250, 50);
        Slider yInterestRate = new Slider(0, 10, 5);

        layout.setCenter(lineChart);
        layout.setTop(vertical);

        vertical.getChildren().addAll(subPaneTop, subPaneBottom);
        vertical.setSpacing(20);

        subPaneTop.setLeft(new Label("Monthly savings"));
        subPaneTop.setCenter(monthlySavings);
        subPaneTop.setRight(new Label(String.valueOf(monthlySavings.getValue())));

        monthlySavings.setShowTickLabels(true);
        monthlySavings.setShowTickMarks(true);
        monthlySavings.setMajorTickUnit(25);
        monthlySavings.setBlockIncrement(25);

        subPaneBottom.setLeft(new Label("Yearly interest rate"));
        subPaneBottom.setCenter(yInterestRate);
        subPaneBottom.setRight(new Label(String.valueOf(yInterestRate.getValue())));

        Double val = monthlySavings.getValue();

        XYChart.Series savings = new XYChart.Series();
        XYChart.Series interestSavings = new XYChart.Series();

        
        
        
                  double previous = 0;

        monthlySavings.valueProperty().addListener((observable, oldValue, newValue) -> {
            double monthlySavingsValue = newValue.doubleValue();

            savings.getData().clear();
            for (int year = 0; year <= 30; year++) {
                double sum = (monthlySavingsValue * 12) * year;
                savings.getData().add(new XYChart.Data<>(year, sum));
            }
        });
        yInterestRate.valueProperty().addListener((observable, oldValue, newValue) -> {
            double yInterestRateValue = newValue.doubleValue();
            interestSavings.getData().clear();
           
         double interest = 0;

            for (int year = 1; year <= 30; year++) {
                  interest += monthlySavings.getValue()  * 12;
               interest *= (yInterestRate.getValue() / 100 + 1);
                System.out.println("year: " + year + "and Sum: " + interest);
                interestSavings.getData().add(new XYChart.Data<>(year, interest));
            }
        });
        
         double interest = 0;
        for (int year = 0; year <= 30; year++) {

               previous += monthlySavings.getValue()  * 12;
               previous *= (yInterestRate.getValue() / 100 + 1);

                System.out.println("year: " + year + "and Sum: " + previous);
                interestSavings.getData().add(new XYChart.Data<>(year, previous));

            }

//        Double sum = 0.0;
        for (int year = 0; year <= 30; year++) {
            previous = (monthlySavings.getValue() * 12) * year;
            savings.getData().add(new XYChart.Data(year, previous));
        }
        lineChart.getData().add(savings);
        lineChart.getData().add(interestSavings);

        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }
}