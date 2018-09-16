package dataconnections;

import javafx.scene.control.Button;
import javafx.geometry.Insets;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DataConnections extends Application {

    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;
    
    NumberAxis yAxis = new NumberAxis();
    NumberAxis xAxis = new NumberAxis();
     
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        window = primaryStage;
        window.setTitle("FBI Crime Statistics");
        button = new Button("Display");
        
        listView = new ListView<>();
        listView.getItems().addAll("Crimes", "Murder Rate", "Rape Rate", "Robbery Rate", "Aggravated Assault Rate");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        button.setOnAction(e -> buttonClicked());
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);
        
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
                
        
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
        series.getData().add(new XYChart.Data(2002, 494.4));
        series.getData().add(new XYChart.Data(2003, 475.8));
        series.getData().add(new XYChart.Data(2004, 463.2));
        series.getData().add(new XYChart.Data(2005, 469.0));
        series.getData().add(new XYChart.Data(2006, 479.3));
        series.getData().add(new XYChart.Data(2007, 471.8));
        series.getData().add(new XYChart.Data(2008, 458.6));
        series.getData().add(new XYChart.Data(2009, 431.9));
        series.getData().add(new XYChart.Data(2010, 404.5));
        series.getData().add(new XYChart.Data(2011, 387.1));        
        series.getData().add(new XYChart.Data(2012, 387.8));        
        series.getData().add(new XYChart.Data(2013, 369.1));        
        series.getData().add(new XYChart.Data(2014, 361.6));        
        series.getData().add(new XYChart.Data(2015, 373.7));
        series.getData().add(new XYChart.Data(2016, 386.3));
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Murder Rate");
        
        series2.getData().add(new XYChart.Data(1997, 6.8 ));
        series2.getData().add(new XYChart.Data(1998, 6.3));
        series2.getData().add(new XYChart.Data(1999, 5.7));
        series2.getData().add(new XYChart.Data(2000, 5.5));
        series2.getData().add(new XYChart.Data(2001, 5.6));
        series2.getData().add(new XYChart.Data(2002, 5.6));
        series2.getData().add(new XYChart.Data(2003, 5.7));
        series2.getData().add(new XYChart.Data(2004, 5.5));
        series2.getData().add(new XYChart.Data(2005, 5.6));
        series2.getData().add(new XYChart.Data(2006, 5.8));
        series2.getData().add(new XYChart.Data(2007, 5.7));
        series2.getData().add(new XYChart.Data(2008, 5.4));
        series2.getData().add(new XYChart.Data(2009, 5.0));
        series2.getData().add(new XYChart.Data(2010, 4.8));
        series2.getData().add(new XYChart.Data(2011, 4.7));        
        series2.getData().add(new XYChart.Data(2012, 4.7));        
        series2.getData().add(new XYChart.Data(2013, 4.5));        
        series2.getData().add(new XYChart.Data(2014, 4.4));        
        series2.getData().add(new XYChart.Data(2015, 4.9));
        series2.getData().add(new XYChart.Data(2016, 5.3));
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Rape Rate");
        
        series3.getData().add(new XYChart.Data(1997, 35.9));
        series3.getData().add(new XYChart.Data(1998, 34.5));
        series3.getData().add(new XYChart.Data(1999, 32.8));
        series3.getData().add(new XYChart.Data(2000, 32.0));
        series3.getData().add(new XYChart.Data(2001, 31.8));
        series3.getData().add(new XYChart.Data(2002, 33.1));
        series3.getData().add(new XYChart.Data(2003, 32.3));
        series3.getData().add(new XYChart.Data(2004, 32.4));
        series3.getData().add(new XYChart.Data(2005, 31.8));
        series3.getData().add(new XYChart.Data(2006, 31.6));
        series3.getData().add(new XYChart.Data(2007, 30.6));
        series3.getData().add(new XYChart.Data(2008, 29.8));
        series3.getData().add(new XYChart.Data(2009, 29.1));
        series3.getData().add(new XYChart.Data(2010, 27.7));
        series3.getData().add(new XYChart.Data(2011, 27.0));        
        series3.getData().add(new XYChart.Data(2012, 27.1));        
        series3.getData().add(new XYChart.Data(2013, 25.9));        
        series3.getData().add(new XYChart.Data(2014, 26.6));        
        series3.getData().add(new XYChart.Data(2015, 28.4));
        series3.getData().add(new XYChart.Data(2016, 29.6));
        
        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Robbery Rate");
        
        series4.getData().add(new XYChart.Data(1997, 186.2));
        series4.getData().add(new XYChart.Data(1998, 165.5));
        series4.getData().add(new XYChart.Data(1999, 150.1));
        series4.getData().add(new XYChart.Data(2000, 145.0));
        series4.getData().add(new XYChart.Data(2001, 148.5));
        series4.getData().add(new XYChart.Data(2002, 146.1));
        series4.getData().add(new XYChart.Data(2003, 142.5));
        series4.getData().add(new XYChart.Data(2004, 136.7));
        series4.getData().add(new XYChart.Data(2005, 140.8));
        series4.getData().add(new XYChart.Data(2006, 150.0));
        series4.getData().add(new XYChart.Data(2007, 148.3));
        series4.getData().add(new XYChart.Data(2008, 145.9));
        series4.getData().add(new XYChart.Data(2009, 133.1));
        series4.getData().add(new XYChart.Data(2010, 119.3));
        series4.getData().add(new XYChart.Data(2011, 113.9));        
        series4.getData().add(new XYChart.Data(2012, 113.1));        
        series4.getData().add(new XYChart.Data(2013, 109.0));        
        series4.getData().add(new XYChart.Data(2014, 101.3));        
        series4.getData().add(new XYChart.Data(2015, 102.2));
        series4.getData().add(new XYChart.Data(2016, 102.8));
        
        XYChart.Series series5 = new XYChart.Series();
        series5.setName("Aggravated Assault Rate");
        
        series5.getData().add(new XYChart.Data(1997, 382.1));
        series5.getData().add(new XYChart.Data(1998, 361.4));
        series5.getData().add(new XYChart.Data(1999, 334.3));
        series5.getData().add(new XYChart.Data(2000, 324.0));
        series5.getData().add(new XYChart.Data(2001, 318.6));
        series5.getData().add(new XYChart.Data(2002, 309.5));
        series5.getData().add(new XYChart.Data(2003, 295.4));
        series5.getData().add(new XYChart.Data(2004, 288.6));
        series5.getData().add(new XYChart.Data(2005, 290.8));
        series5.getData().add(new XYChart.Data(2006, 292.0));
        series5.getData().add(new XYChart.Data(2007, 287.2));
        series5.getData().add(new XYChart.Data(2008, 277.5));
        series5.getData().add(new XYChart.Data(2009, 264.7));
        series5.getData().add(new XYChart.Data(2010, 252.8));
        series5.getData().add(new XYChart.Data(2011, 241.5));        
        series5.getData().add(new XYChart.Data(2012, 242.8));        
        series5.getData().add(new XYChart.Data(2013, 229.6));        
        series5.getData().add(new XYChart.Data(2014, 229.2));        
        series5.getData().add(new XYChart.Data(2015, 238.1));
        series5.getData().add(new XYChart.Data(2016, 248.5));
        
        
      
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
        lineChart.getData().add(series2);
        lineChart.getData().add(series3);
        lineChart.getData().add(series4);
        lineChart.getData().add(series5);
       
        primaryStage.setScene(scene);
        primaryStage.show();
        


    }
    
    private void buttonClicked() {
        
        String message = "";
        ObservableList<String> crimes;
        crimes = listView.getSelectionModel().getSelectedItems();
        
        for(String c: crimes) {
            
            message += c + "\n";
            
        }
        
        System.out.println(message);
        
    }
    
    public static void main(String[] args) throws IOException {
       // FBISiteParser site = new FBISiteParser();
       // site.parse();
        launch(args);
        
    }
    
}
