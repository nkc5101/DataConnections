
package dataconnections;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;


public class DataConnectionsController implements Initializable {
    
    @FXML
    private LineChart<String, Number> lineChart;
    @FXML
    private Label label;
    @FXML
    private Button loadButton;
    @FXML
    private Button murderAndManslaughterButton;
    @FXML
    private Button rapeButton;
    @FXML
    private Button robberyButton;
    @FXML
    private Button aggravatedAssaultButton;
    @FXML
    private Button burglaryButton;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }
    
    public void loadChart(ActionEvent event) {
        
        lineChart.getData().clear();
        
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        
        series.getData().add(new XYChart.Data("1997", 611 ));
        series.getData().add(new XYChart.Data("1998", 567.6));
        series.getData().add(new XYChart.Data("1999", 523));
        series.getData().add(new XYChart.Data("2000", 506.5));
        series.getData().add(new XYChart.Data("2001", 504.5));
        series.getData().add(new XYChart.Data("2002", 494.4));
        series.getData().add(new XYChart.Data("2003", 475.8));
        series.getData().add(new XYChart.Data("2004", 463.2));
        series.getData().add(new XYChart.Data("2005", 469.0));
        series.getData().add(new XYChart.Data("2006", 479.3));
        series.getData().add(new XYChart.Data("2007", 471.8));
        series.getData().add(new XYChart.Data("2008", 458.6));
        series.getData().add(new XYChart.Data("2009", 431.9));
        series.getData().add(new XYChart.Data("2010", 404.5));
        series.getData().add(new XYChart.Data("2011", 387.1));        
        series.getData().add(new XYChart.Data("2012", 387.8));        
        series.getData().add(new XYChart.Data("2013", 369.1));        
        series.getData().add(new XYChart.Data("2014", 361.6));        
        series.getData().add(new XYChart.Data("2015", 373.7));
        series.getData().add(new XYChart.Data("2016", 386.3));
        series.setName("Crimes");
        
        lineChart.getData().addAll(series);
        
        for (final XYChart.Data<String, Number> data : series.getData()) {
            
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                
                @Override
                public void handle(MouseEvent event) {
                    
                    label.setText("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(), new Tooltip("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue())));
                }
                
            });
            
        }
    }
    
    public void murderAndManslaughterChart(ActionEvent event){
        lineChart.getData().clear();
        
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        
        series.getData().add(new XYChart.Data("1997", 611 ));
        series.getData().add(new XYChart.Data("1998", 567.6));
        series.getData().add(new XYChart.Data("1999", 523));
        series.getData().add(new XYChart.Data("2000", 506.5));
        series.getData().add(new XYChart.Data("2001", 504.5));
        series.getData().add(new XYChart.Data("2002", 494.4));
        series.getData().add(new XYChart.Data("2003", 475.8));
        series.getData().add(new XYChart.Data("2004", 463.2));
        series.getData().add(new XYChart.Data("2005", 469.0));
        series.getData().add(new XYChart.Data("2006", 479.3));
        series.getData().add(new XYChart.Data("2007", 471.8));
        series.getData().add(new XYChart.Data("2008", 458.6));
        series.getData().add(new XYChart.Data("2009", 431.9));
        series.getData().add(new XYChart.Data("2010", 404.5));
        series.getData().add(new XYChart.Data("2011", 387.1));        
        series.getData().add(new XYChart.Data("2012", 387.8));        
        series.getData().add(new XYChart.Data("2013", 369.1));        
        series.getData().add(new XYChart.Data("2014", 361.6));        
        series.getData().add(new XYChart.Data("2015", 373.7));
        series.getData().add(new XYChart.Data("2016", 386.3));
        series.setName("Murder and Nonnegligent Manslaughter");
        
        lineChart.getData().addAll(series);
        
        for (final XYChart.Data<String, Number> data : series.getData()) {
            
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                
                @Override
                public void handle(MouseEvent event) {
                    
                    label.setText("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(), new Tooltip("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue())));
                }
                
            });
            
        }
    }
    
    public void rapeChart(ActionEvent event){
        lineChart.getData().clear();
        
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        
        series.getData().add(new XYChart.Data("1997", 611 ));
        series.getData().add(new XYChart.Data("1998", 567.6));
        series.getData().add(new XYChart.Data("1999", 523));
        series.getData().add(new XYChart.Data("2000", 506.5));
        series.getData().add(new XYChart.Data("2001", 504.5));
        series.getData().add(new XYChart.Data("2002", 494.4));
        series.getData().add(new XYChart.Data("2003", 475.8));
        series.getData().add(new XYChart.Data("2004", 463.2));
        series.getData().add(new XYChart.Data("2005", 469.0));
        series.getData().add(new XYChart.Data("2006", 479.3));
        series.getData().add(new XYChart.Data("2007", 471.8));
        series.getData().add(new XYChart.Data("2008", 458.6));
        series.getData().add(new XYChart.Data("2009", 431.9));
        series.getData().add(new XYChart.Data("2010", 404.5));
        series.getData().add(new XYChart.Data("2011", 387.1));        
        series.getData().add(new XYChart.Data("2012", 387.8));        
        series.getData().add(new XYChart.Data("2013", 369.1));        
        series.getData().add(new XYChart.Data("2014", 361.6));        
        series.getData().add(new XYChart.Data("2015", 373.7));
        series.getData().add(new XYChart.Data("2016", 386.3));
        series.setName("Rapes");
        
        lineChart.getData().addAll(series);
        
        for (final XYChart.Data<String, Number> data : series.getData()) {
            
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                
                @Override
                public void handle(MouseEvent event) {
                    
                    label.setText("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(), new Tooltip("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue())));
                }
                
            });
            
        }
    }
    
    public void robberyChart(ActionEvent event){
        lineChart.getData().clear();
        
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        
        series.getData().add(new XYChart.Data("1997", 611 ));
        series.getData().add(new XYChart.Data("1998", 567.6));
        series.getData().add(new XYChart.Data("1999", 523));
        series.getData().add(new XYChart.Data("2000", 506.5));
        series.getData().add(new XYChart.Data("2001", 504.5));
        series.getData().add(new XYChart.Data("2002", 494.4));
        series.getData().add(new XYChart.Data("2003", 475.8));
        series.getData().add(new XYChart.Data("2004", 463.2));
        series.getData().add(new XYChart.Data("2005", 469.0));
        series.getData().add(new XYChart.Data("2006", 479.3));
        series.getData().add(new XYChart.Data("2007", 471.8));
        series.getData().add(new XYChart.Data("2008", 458.6));
        series.getData().add(new XYChart.Data("2009", 431.9));
        series.getData().add(new XYChart.Data("2010", 404.5));
        series.getData().add(new XYChart.Data("2011", 387.1));        
        series.getData().add(new XYChart.Data("2012", 387.8));        
        series.getData().add(new XYChart.Data("2013", 369.1));        
        series.getData().add(new XYChart.Data("2014", 361.6));        
        series.getData().add(new XYChart.Data("2015", 373.7));
        series.getData().add(new XYChart.Data("2016", 386.3));
        series.setName("Robbery");
        
        lineChart.getData().addAll(series);
        
        for (final XYChart.Data<String, Number> data : series.getData()) {
            
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                
                @Override
                public void handle(MouseEvent event) {
                    
                    label.setText("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(), new Tooltip("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue())));
                }
                
            });
            
        }
    }
    
    public void aggravatedAssaultChart(ActionEvent event){
        lineChart.getData().clear();
        
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        
        series.getData().add(new XYChart.Data("1997", 611 ));
        series.getData().add(new XYChart.Data("1998", 567.6));
        series.getData().add(new XYChart.Data("1999", 523));
        series.getData().add(new XYChart.Data("2000", 506.5));
        series.getData().add(new XYChart.Data("2001", 504.5));
        series.getData().add(new XYChart.Data("2002", 494.4));
        series.getData().add(new XYChart.Data("2003", 475.8));
        series.getData().add(new XYChart.Data("2004", 463.2));
        series.getData().add(new XYChart.Data("2005", 469.0));
        series.getData().add(new XYChart.Data("2006", 479.3));
        series.getData().add(new XYChart.Data("2007", 471.8));
        series.getData().add(new XYChart.Data("2008", 458.6));
        series.getData().add(new XYChart.Data("2009", 431.9));
        series.getData().add(new XYChart.Data("2010", 404.5));
        series.getData().add(new XYChart.Data("2011", 387.1));        
        series.getData().add(new XYChart.Data("2012", 387.8));        
        series.getData().add(new XYChart.Data("2013", 369.1));        
        series.getData().add(new XYChart.Data("2014", 361.6));        
        series.getData().add(new XYChart.Data("2015", 373.7));
        series.getData().add(new XYChart.Data("2016", 386.3));
        series.setName("Aggravated Assault");
        
        lineChart.getData().addAll(series);
        
        for (final XYChart.Data<String, Number> data : series.getData()) {
            
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                
                @Override
                public void handle(MouseEvent event) {
                    
                    label.setText("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(), new Tooltip("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue())));
                }
                
            });
            
        }
    }
    
    public void burglaryChart(ActionEvent event){
        lineChart.getData().clear();
        
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        
        series.getData().add(new XYChart.Data("1997", 611 ));
        series.getData().add(new XYChart.Data("1998", 567.6));
        series.getData().add(new XYChart.Data("1999", 523));
        series.getData().add(new XYChart.Data("2000", 506.5));
        series.getData().add(new XYChart.Data("2001", 504.5));
        series.getData().add(new XYChart.Data("2002", 494.4));
        series.getData().add(new XYChart.Data("2003", 475.8));
        series.getData().add(new XYChart.Data("2004", 463.2));
        series.getData().add(new XYChart.Data("2005", 469.0));
        series.getData().add(new XYChart.Data("2006", 479.3));
        series.getData().add(new XYChart.Data("2007", 471.8));
        series.getData().add(new XYChart.Data("2008", 458.6));
        series.getData().add(new XYChart.Data("2009", 431.9));
        series.getData().add(new XYChart.Data("2010", 404.5));
        series.getData().add(new XYChart.Data("2011", 387.1));        
        series.getData().add(new XYChart.Data("2012", 387.8));        
        series.getData().add(new XYChart.Data("2013", 369.1));        
        series.getData().add(new XYChart.Data("2014", 361.6));        
        series.getData().add(new XYChart.Data("2015", 373.7));
        series.getData().add(new XYChart.Data("2016", 386.3));
        series.setName("Burglary");
        
        lineChart.getData().addAll(series);
        
        for (final XYChart.Data<String, Number> data : series.getData()) {
            
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                
                @Override
                public void handle(MouseEvent event) {
                    
                    label.setText("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(), new Tooltip("Year : " + data.getXValue() + "\nRate : " + String.valueOf(data.getYValue())));
                }
                
            });
            
        }
    }
}
