//make document class
package oodj;

import java.io.FileOutputStream;
import java.io.StringReader;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class document {
    private String filename;
    private String content;
    
    //constructor
    public document(String filename, String content) {
        this.filename = filename;
        this.content = content;
    }
    
    //getters and setters
    public String getFilename() {
        return filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String CreateTable(List<String> data, int columns, int rows) {
        String html = "<table border='1' style='border-collapse: collapse; width: 100%;'> \n";
        for (int i = 0; i < rows; i++) {
            html += "  <tr> \n";
            for (int j = 0; j < columns; j++) {
                int index = i * columns + j;
                if (index < data.size()) {
                    html += "    <td style='padding: 8px; text-align: left;'>" + data.get(index) + "</td> \n";
                } else {
                    html += "    <td style='padding: 8px; text-align: left;'></td> \n";
                }
            }
            html += "  </tr> \n";
        }
        return html + "</table>";
    }
    public String createProgress(float percentage) {

        String color;
        if (percentage < 50) {
            color = "#ff4d4d"; // red
        } else if (percentage <= 75) {
            color = "#ffd633"; // yellow
        } else {
            color = "#4caf50"; // green
        }

        String html = "<div style='position: relative; width: 100px; height: 100px; border-radius: 50%; "
                    + "background: conic-gradient(" + color + " 0% " + percentage + "%, #e0e0e0 " + percentage + "% 100%); "
                    + "display: flex; align-items: center; justify-content: center;'>"
                    + "<div style='position: absolute; width: 80px; height: 80px; background: white; border-radius: 50%; "
                    + "display: flex; align-items: center; justify-content: center; font-family: Arial, sans-serif; "
                    + "font-size: 20px; color: #333; font-weight: bold;'>"
                    + percentage + "%</div></div>";

        return html;
    }
    public void ToDocument(String content, String filename, String Table , String Progress) {
        // combines all html parts into a single html document and converts to pdf using itext
        String fullhtml = "<html><head><title></title></head><body>" + content + "\n" + Table + "\n" + Progress + "</body></html>";
        Document doc = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(filename + ".pdf"));
            doc.open();
            XMLWorkerHelper.getInstance().parseXHtml(writer, doc, new StringReader(fullhtml));
            doc.close();
            System.out.println(fullhtml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ToDocument(String content, String filename) {
        // combines all html parts into a single html document and converts to pdf using itext

        
    }
}