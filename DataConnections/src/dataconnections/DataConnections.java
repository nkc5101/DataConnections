package dataconnections;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class DataConnections extends Application {

    
     NumberAxis yAxis = new NumberAxis();
     NumberAxis xAxis = new NumberAxis();
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FBI Crime Statistics");
        xAxis.setLabel("Year");
        yAxis.setLabel("Violent Crime Rate");
        xAxis.setForceZeroInRange(false);
        xAxis.setUpperBound(2016);
        xAxis.setLowerBound(1997);
        xAxis.setTickUnit(5);
        final LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setTitle("FBI Crime Stats");
        XYChart.Series series = new XYChart.Series();
        series.setName("Crimes");
        series.getData().add(new XYChart.Data(1997, 611 ));
        series.getData().add(new XYChart.Data(1998, 567.6));
        series.getData().add(new XYChart.Data(1999, 523));
        series.getData().add(new XYChart.Data(2000, 506.5));
        series.getData().add(new XYChart.Data(2001, 504.5));
        
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
       
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) throws IOException {
       // FBISiteParser site = new FBISiteParser();
       // site.parse();
        launch(args);
        
    }
    
}
