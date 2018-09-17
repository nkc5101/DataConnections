
package dataconnections;

import java.net.URL;
import java.util.ArrayList;
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
    
    ArrayList<String[]> tableData;
    
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
        
        
            
            for(int j=0; j<tableData.size(); j++){
                
                if(tableData.get(j)[2].contains(".")){
                    
                    int error = tableData.get(j)[2].indexOf(".");
                    tableData.get(j)[2] = tableData.get(j)[2].substring(0, error);
                    
                } 
                
            }
            
            series.getData().add(new XYChart.Data("1997", Integer.parseInt(tableData.get(0)[2])));
            series.getData().add(new XYChart.Data("1998", Integer.parseInt(tableData.get(1)[2])));
            series.getData().add(new XYChart.Data("1999", Integer.parseInt(tableData.get(2)[2])));
            series.getData().add(new XYChart.Data("2000", Integer.parseInt(tableData.get(3)[2])));
            series.getData().add(new XYChart.Data("2001", Integer.parseInt(tableData.get(4)[2])));
            series.getData().add(new XYChart.Data("2002", Integer.parseInt(tableData.get(5)[2])));
            series.getData().add(new XYChart.Data("2003", Integer.parseInt(tableData.get(6)[2])));
            series.getData().add(new XYChart.Data("2004", Integer.parseInt(tableData.get(7)[2])));
            series.getData().add(new XYChart.Data("2005", Integer.parseInt(tableData.get(8)[2])));
            series.getData().add(new XYChart.Data("2006", Integer.parseInt(tableData.get(9)[2])));
            series.getData().add(new XYChart.Data("2007", Integer.parseInt(tableData.get(10)[2])));
            series.getData().add(new XYChart.Data("2008", Integer.parseInt(tableData.get(11)[2])));
            series.getData().add(new XYChart.Data("2009", Integer.parseInt(tableData.get(12)[2])));
            series.getData().add(new XYChart.Data("2010", Integer.parseInt(tableData.get(13)[2])));
            series.getData().add(new XYChart.Data("2011", Integer.parseInt(tableData.get(14)[2])));
            series.getData().add(new XYChart.Data("2012", Integer.parseInt(tableData.get(15)[2])));
            series.getData().add(new XYChart.Data("2013", Integer.parseInt(tableData.get(16)[2])));
            series.getData().add(new XYChart.Data("2014", Integer.parseInt(tableData.get(17)[2])));
            series.getData().add(new XYChart.Data("2015", Integer.parseInt(tableData.get(18)[2])));
            series.getData().add(new XYChart.Data("2016", Integer.parseInt(tableData.get(19)[2])));
        series.setName("Violent Crime Rate");
        
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
        
            for(int j=0; j<tableData.size(); j++){
                
                if(tableData.get(j)[4].contains(".")){
                    
                    int error = tableData.get(j)[4].indexOf(".");
                    tableData.get(j)[4] = tableData.get(j)[4].substring(0, error);
                    
                } 
                
            }
            
            series.getData().add(new XYChart.Data("1997", Integer.parseInt(tableData.get(0)[4])));
            series.getData().add(new XYChart.Data("1998", Integer.parseInt(tableData.get(1)[4])));
            series.getData().add(new XYChart.Data("1999", Integer.parseInt(tableData.get(2)[4])));
            series.getData().add(new XYChart.Data("2000", Integer.parseInt(tableData.get(3)[4])));
            series.getData().add(new XYChart.Data("2001", Integer.parseInt(tableData.get(4)[4])));
            series.getData().add(new XYChart.Data("2002", Integer.parseInt(tableData.get(5)[4])));
            series.getData().add(new XYChart.Data("2003", Integer.parseInt(tableData.get(6)[4])));
            series.getData().add(new XYChart.Data("2004", Integer.parseInt(tableData.get(7)[4])));
            series.getData().add(new XYChart.Data("2005", Integer.parseInt(tableData.get(8)[4])));
            series.getData().add(new XYChart.Data("2006", Integer.parseInt(tableData.get(9)[4])));
            series.getData().add(new XYChart.Data("2007", Integer.parseInt(tableData.get(10)[4])));
            series.getData().add(new XYChart.Data("2008", Integer.parseInt(tableData.get(11)[4])));
            series.getData().add(new XYChart.Data("2009", Integer.parseInt(tableData.get(12)[4])));
            series.getData().add(new XYChart.Data("2010", Integer.parseInt(tableData.get(13)[4])));
            series.getData().add(new XYChart.Data("2011", Integer.parseInt(tableData.get(14)[4])));
            series.getData().add(new XYChart.Data("2012", Integer.parseInt(tableData.get(15)[4])));
            series.getData().add(new XYChart.Data("2013", Integer.parseInt(tableData.get(16)[4])));
            series.getData().add(new XYChart.Data("2014", Integer.parseInt(tableData.get(17)[4])));
            series.getData().add(new XYChart.Data("2015", Integer.parseInt(tableData.get(18)[4])));
            series.getData().add(new XYChart.Data("2016", Integer.parseInt(tableData.get(19)[4])));
        series.setName("Murder and Nonnegligent Manslaughter Rate");
        
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
        
            for(int j=0; j<tableData.size(); j++){
                
                if(tableData.get(j)[8].contains(".")){
                    
                    int error = tableData.get(j)[8].indexOf(".");
                    tableData.get(j)[8] = tableData.get(j)[8].substring(0, error);
                    
                } 
                
            }
            
            series.getData().add(new XYChart.Data("1997", Integer.parseInt(tableData.get(0)[8])));
            series.getData().add(new XYChart.Data("1998", Integer.parseInt(tableData.get(1)[8])));
            series.getData().add(new XYChart.Data("1999", Integer.parseInt(tableData.get(2)[8])));
            series.getData().add(new XYChart.Data("2000", Integer.parseInt(tableData.get(3)[8])));
            series.getData().add(new XYChart.Data("2001", Integer.parseInt(tableData.get(4)[8])));
            series.getData().add(new XYChart.Data("2002", Integer.parseInt(tableData.get(5)[8])));
            series.getData().add(new XYChart.Data("2003", Integer.parseInt(tableData.get(6)[8])));
            series.getData().add(new XYChart.Data("2004", Integer.parseInt(tableData.get(7)[8])));
            series.getData().add(new XYChart.Data("2005", Integer.parseInt(tableData.get(8)[8])));
            series.getData().add(new XYChart.Data("2006", Integer.parseInt(tableData.get(9)[8])));
            series.getData().add(new XYChart.Data("2007", Integer.parseInt(tableData.get(10)[8])));
            series.getData().add(new XYChart.Data("2008", Integer.parseInt(tableData.get(11)[8])));
            series.getData().add(new XYChart.Data("2009", Integer.parseInt(tableData.get(12)[8])));
            series.getData().add(new XYChart.Data("2010", Integer.parseInt(tableData.get(13)[8])));
            series.getData().add(new XYChart.Data("2011", Integer.parseInt(tableData.get(14)[8])));
            series.getData().add(new XYChart.Data("2012", Integer.parseInt(tableData.get(15)[8])));
            series.getData().add(new XYChart.Data("2013", Integer.parseInt(tableData.get(16)[8])));
            series.getData().add(new XYChart.Data("2014", Integer.parseInt(tableData.get(17)[8])));
            series.getData().add(new XYChart.Data("2015", Integer.parseInt(tableData.get(18)[8])));
            series.getData().add(new XYChart.Data("2016", Integer.parseInt(tableData.get(19)[8])));
        series.setName("Rape Rate");
        
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
        
            for(int j=0; j<tableData.size(); j++){
                
                if(tableData.get(j)[10].contains(".")){
                    
                    int error = tableData.get(j)[10].indexOf(".");
                    tableData.get(j)[10] = tableData.get(j)[10].substring(0, error);
                    
                } 
                
            }
            
            series.getData().add(new XYChart.Data("1997", Integer.parseInt(tableData.get(0)[10])));
            series.getData().add(new XYChart.Data("1998", Integer.parseInt(tableData.get(1)[10])));
            series.getData().add(new XYChart.Data("1999", Integer.parseInt(tableData.get(2)[10])));
            series.getData().add(new XYChart.Data("2000", Integer.parseInt(tableData.get(3)[10])));
            series.getData().add(new XYChart.Data("2001", Integer.parseInt(tableData.get(4)[10])));
            series.getData().add(new XYChart.Data("2002", Integer.parseInt(tableData.get(5)[10])));
            series.getData().add(new XYChart.Data("2003", Integer.parseInt(tableData.get(6)[10])));
            series.getData().add(new XYChart.Data("2004", Integer.parseInt(tableData.get(7)[10])));
            series.getData().add(new XYChart.Data("2005", Integer.parseInt(tableData.get(8)[10])));
            series.getData().add(new XYChart.Data("2006", Integer.parseInt(tableData.get(9)[10])));
            series.getData().add(new XYChart.Data("2007", Integer.parseInt(tableData.get(10)[10])));
            series.getData().add(new XYChart.Data("2008", Integer.parseInt(tableData.get(11)[10])));
            series.getData().add(new XYChart.Data("2009", Integer.parseInt(tableData.get(12)[10])));
            series.getData().add(new XYChart.Data("2010", Integer.parseInt(tableData.get(13)[10])));
            series.getData().add(new XYChart.Data("2011", Integer.parseInt(tableData.get(14)[10])));
            series.getData().add(new XYChart.Data("2012", Integer.parseInt(tableData.get(15)[10])));
            series.getData().add(new XYChart.Data("2013", Integer.parseInt(tableData.get(16)[10])));
            series.getData().add(new XYChart.Data("2014", Integer.parseInt(tableData.get(17)[10])));
            series.getData().add(new XYChart.Data("2015", Integer.parseInt(tableData.get(18)[10])));
            series.getData().add(new XYChart.Data("2016", Integer.parseInt(tableData.get(19)[10])));
        series.setName("Robbery Rate");
        
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
        
            for(int j=0; j<tableData.size(); j++){
                
                if(tableData.get(j)[12].contains(".")){
                    
                    int error = tableData.get(j)[12].indexOf(".");
                    tableData.get(j)[12] = tableData.get(j)[12].substring(0, error);
                    
                } 
                
            }
            
            series.getData().add(new XYChart.Data("1997", Integer.parseInt(tableData.get(0)[12])));
            series.getData().add(new XYChart.Data("1998", Integer.parseInt(tableData.get(1)[12])));
            series.getData().add(new XYChart.Data("1999", Integer.parseInt(tableData.get(2)[12])));
            series.getData().add(new XYChart.Data("2000", Integer.parseInt(tableData.get(3)[12])));
            series.getData().add(new XYChart.Data("2001", Integer.parseInt(tableData.get(4)[12])));
            series.getData().add(new XYChart.Data("2002", Integer.parseInt(tableData.get(5)[12])));
            series.getData().add(new XYChart.Data("2003", Integer.parseInt(tableData.get(6)[12])));
            series.getData().add(new XYChart.Data("2004", Integer.parseInt(tableData.get(7)[12])));
            series.getData().add(new XYChart.Data("2005", Integer.parseInt(tableData.get(8)[12])));
            series.getData().add(new XYChart.Data("2006", Integer.parseInt(tableData.get(9)[12])));
            series.getData().add(new XYChart.Data("2007", Integer.parseInt(tableData.get(10)[12])));
            series.getData().add(new XYChart.Data("2008", Integer.parseInt(tableData.get(11)[12])));
            series.getData().add(new XYChart.Data("2009", Integer.parseInt(tableData.get(12)[12])));
            series.getData().add(new XYChart.Data("2010", Integer.parseInt(tableData.get(13)[12])));
            series.getData().add(new XYChart.Data("2011", Integer.parseInt(tableData.get(14)[12])));
            series.getData().add(new XYChart.Data("2012", Integer.parseInt(tableData.get(15)[12])));
            series.getData().add(new XYChart.Data("2013", Integer.parseInt(tableData.get(16)[12])));
            series.getData().add(new XYChart.Data("2014", Integer.parseInt(tableData.get(17)[12])));
            series.getData().add(new XYChart.Data("2015", Integer.parseInt(tableData.get(18)[12])));
            series.getData().add(new XYChart.Data("2016", Integer.parseInt(tableData.get(19)[12])));
        series.setName("Aggravated Assault Rate");
        
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
        
            for(int j=0; j<tableData.size(); j++){
                
                if(tableData.get(j)[16].contains(".")){
                    
                    int error = tableData.get(j)[16].indexOf(".");
                    tableData.get(j)[16] = tableData.get(j)[16].substring(0, error);
                    
                } 
                
            }
            
            series.getData().add(new XYChart.Data("1997", Integer.parseInt(tableData.get(0)[16])));
            series.getData().add(new XYChart.Data("1998", Integer.parseInt(tableData.get(1)[16])));
            series.getData().add(new XYChart.Data("1999", Integer.parseInt(tableData.get(2)[16])));
            series.getData().add(new XYChart.Data("2000", Integer.parseInt(tableData.get(3)[16])));
            series.getData().add(new XYChart.Data("2001", Integer.parseInt(tableData.get(4)[16])));
            series.getData().add(new XYChart.Data("2002", Integer.parseInt(tableData.get(5)[16])));
            series.getData().add(new XYChart.Data("2003", Integer.parseInt(tableData.get(6)[16])));
            series.getData().add(new XYChart.Data("2004", Integer.parseInt(tableData.get(7)[16])));
            series.getData().add(new XYChart.Data("2005", Integer.parseInt(tableData.get(8)[16])));
            series.getData().add(new XYChart.Data("2006", Integer.parseInt(tableData.get(9)[16])));
            series.getData().add(new XYChart.Data("2007", Integer.parseInt(tableData.get(10)[16])));
            series.getData().add(new XYChart.Data("2008", Integer.parseInt(tableData.get(11)[16])));
            series.getData().add(new XYChart.Data("2009", Integer.parseInt(tableData.get(12)[16])));
            series.getData().add(new XYChart.Data("2010", Integer.parseInt(tableData.get(13)[16])));
            series.getData().add(new XYChart.Data("2011", Integer.parseInt(tableData.get(14)[16])));
            series.getData().add(new XYChart.Data("2012", Integer.parseInt(tableData.get(15)[16])));
            series.getData().add(new XYChart.Data("2013", Integer.parseInt(tableData.get(16)[16])));
            series.getData().add(new XYChart.Data("2014", Integer.parseInt(tableData.get(17)[16])));
            series.getData().add(new XYChart.Data("2015", Integer.parseInt(tableData.get(18)[16])));
            series.getData().add(new XYChart.Data("2016", Integer.parseInt(tableData.get(19)[16])));
        series.setName("Burglary Rate");
        
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
    
    public void setData(ArrayList<String[]> data){
        tableData = data;
    }
    
}
