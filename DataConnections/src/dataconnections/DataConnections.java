package dataconnections;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
