
package dataconnections;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FBISiteParser {
    
    public void parse() throws IOException {
        
        Document document;
        document = Jsoup.connect("https://ucr.fbi.gov/crime-in-the-u.s/2016/crime-in-the-u.s.-2016/topic-pages/tables/table-1").get();
        
        Element table = document.select("table").get(0);
        Elements rows = table.select("tr");
        
        for (int i = 1; i < rows.size(); i++) {
            Element row = rows.get(i);
            Elements columns = row.select("td");
            System.out.println(columns);
        }
    }
    
}
