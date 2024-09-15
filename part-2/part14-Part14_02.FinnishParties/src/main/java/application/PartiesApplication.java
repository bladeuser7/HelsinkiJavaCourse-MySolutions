package application;

import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008,4);
        NumberAxis yAxis = new NumberAxis(0,30,5);
//        HashMap<Integer, Double> point = new HashMap();
        ArrayList<Integer> years = new ArrayList<>();
        HashMap<String, HashMap> politicalParty = new HashMap<>();

//        XYChart.Series<Number, Number> series = new XYChart.Series<>();

        xAxis.setLabel("Year");
        yAxis.setLabel("Patry");

       LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
lineChart.setTitle("Relative support in the years 1968-2008");

try (Scanner scan = new Scanner(Paths.get("partiesdata.tsv"))) {
    int counter = 0;
    while (scan.hasNextLine()) {
        String row = scan.nextLine();
        String[] pieces = row.split("\t");

        if (counter == 0) {
            for (int i = 0; i < pieces.length - 1; i++) {
                years.add(Integer.valueOf(pieces[i + 1]));
            }
        } else {
            HashMap<Integer, Double> point = new HashMap<>(); // Create a new point HashMap for each party

            for (int i = 0; i < pieces.length - 1; i++) {
                Double value = null;
                if (!pieces[i + 1].equals("-")) {
                    value = Double.valueOf(pieces[i + 1]);
                }
                point.put(years.get(i), value);
            }

            // Create a new series for each party and add it to the line chart
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName(pieces[0]); // Set the name of the series to the party name

            for (HashMap.Entry<Integer, Double> entry : point.entrySet()) {
                series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
            }

            lineChart.getData().add(series); // Add the series to the line chart
        }

        counter++;
    }
} catch (Exception e) {
    System.out.println("Error " + e);
}

Scene view = new Scene(lineChart, 1280, 960);
stage.setScene(view);
stage.show();

    }

}
