package dataconnections;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class FBISiteParser {
    
    public void parse() throws IOException {
        
        Document document;
        document = Jsoup.connect("https://ucr.fbi.gov/crime-in-the-u.s/2016/crime-in-the-u.s.-2016/topic-pages/tables/table-1").get();
        Elements table = document.getElementsByTag("table");
        
    }
    
}
