
package dataconnections;


import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FBISiteParser {
    ArrayList<String[]> tableData = new ArrayList<>();
    
    public void parse() throws IOException {
        
        Document document;
        document = Jsoup.connect("https://ucr.fbi.gov/crime-in-the-u.s/2016/crime-in-the-u.s.-2016/topic-pages/tables/table-1").get();
        
        Element table = document.select("table").get(0);
        
        Elements headers = table.select("th");
        
        ArrayList crimes = new ArrayList<>();
        ArrayList years = new ArrayList<>();
        
        
        for (int i = 1; i < headers.size(); i++) {
            
            Element header = headers.get(i);
            
            String id = header.attr("id");
            String idNum = id.substring(4, id.length());
            String headerText = header.text();
            
            if (idNum.substring(0,1).equals("3")) {
                
                crimes.add(headerText);
            }
            
            boolean isHeaderNumeric;
            
            try { 
                
                double doubleNum = Double.parseDouble(headerText);
                isHeaderNumeric = true;
            }  
            catch(NumberFormatException nfe) { 
                
                isHeaderNumeric = false;
            }  
            
            if (idNum.substring(idNum.length()-1,idNum.length()).equals("0") && isHeaderNumeric) {
                
                years.add(headerText);
            }
            
           /* System.out.println(header);
            System.out.println(id);
            System.out.println(idNum);
            System.out.println(headerText);
*/
        }
        
       // System.out.println(crimes);
       // System.out.println(years);
        
        Elements rows = table.select("tr");
        
        for (int i = 1; i < rows.size(); i++) {
            String[] data;
            Element row = rows.get(i);
            Elements columns = row.select("td");
            data = columns.text().split(" ");
            tableData.add(data);
            
            
            
            
        }
    }
    public ArrayList<String[]> getData(){
        
        return tableData;
    }
    
}
