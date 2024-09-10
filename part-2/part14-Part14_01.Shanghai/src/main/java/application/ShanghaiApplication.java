package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    private LineChart<Number, Number> lineChart;
    private NumberAxis years;
    private NumberAxis ranking;

    public ShanghaiApplication() {
        this.years = new NumberAxis(2006, 2018, 2);
        this.ranking = new NumberAxis(0,100,10);
        this.lineChart = new LineChart<>(years, ranking);

    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        years.setLabel("Year");
        ranking.setLabel("Ranking");

        lineChart.setTitle("Helsiinki University");

        XYChart.Series helsinki = new XYChart.Series();
        helsinki.setName("Helsinki");

        helsinki.getData().add(new XYChart.Data(2007, 73));
        helsinki.getData().add(new XYChart.Data(2008, 68));
        helsinki.getData().add(new XYChart.Data(2009, 72));
        helsinki.getData().add(new XYChart.Data(2010, 72));
        helsinki.getData().add(new XYChart.Data(2011, 74));
        helsinki.getData().add(new XYChart.Data(2012, 73));
        helsinki.getData().add(new XYChart.Data(2013, 76));
        helsinki.getData().add(new XYChart.Data(2014, 73));
        helsinki.getData().add(new XYChart.Data(2015, 67));
        helsinki.getData().add(new XYChart.Data(2016, 56));
        helsinki.getData().add(new XYChart.Data(2017, 56));

        lineChart.getData().add(helsinki);

        Scene view = new Scene(lineChart, 720, 1080);

        stage.setScene(view);
        stage.show();

    }

}
