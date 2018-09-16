package dataconnections;

import javafx.scene.control.Button;
import javafx.geometry.Insets;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
    
     
     @Override
    public void start(Stage stage) throws Exception {
        
        FBISiteParser site = new FBISiteParser();
        site.parse();
        ArrayList<String[]> data = site.getData();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DataConnections.fxml"));
        Parent root = (Parent) loader.load();
        DataConnectionsController controller = loader.getController();
        controller.setData(data);
        
        
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) throws IOException {
        
        launch(args);
        
    }
    
}
