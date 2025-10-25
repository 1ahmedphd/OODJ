//make document class
package oodj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.itextpdf.html2pdf.HtmlConverter;


public class PDFDocument {
    private String filename;
    private String content;
    
    //constructor
    public PDFDocument(String filename, String content) {
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
        return html + "</table><br><br>";
    }
    public String createProgress(float percentage) {
        String color;
        if (percentage < 50) {
            color = "#ff4d4d";
        } else if (percentage <= 75) {
            color = "#ffd633";
        } else {
            color = "#4caf50";
        }

        percentage = Math.max(0, Math.min(100, percentage));

        double angle = percentage * 360 / 100.0;

        double radians = Math.toRadians(angle - 90); // start at top
        double x = 50 + 45 * Math.cos(radians);
        double y = 50 + 45 * Math.sin(radians);
        int largeArc = (percentage > 50) ? 1 : 0;

        String path = String.format(
            "M50,5 A45,45 0 %d,1 %.2f,%.2f", largeArc, x, y
        );

        return "<svg width='100' height='100' viewBox='0 0 100 100'>"
             + "<circle cx='50' cy='50' r='45' stroke='#e0e0e0' stroke-width='10' fill='none'/>"
             + "<path d='" + path + "' stroke='" + color + "' stroke-width='10' fill='none'/>"
             + "<text x='50' y='57' text-anchor='middle' font-size='20' font-family='Arial' fill='#333'>"
             + (int)percentage + "%</text>"
             + "</svg>";
    }



    public void ToDocument(String Table , String Progress) {
        // combines all html parts into a single html document and converts to pdf using itext
       String fullHtml = "<html><head><title></title></head><body>"
                    + content + "\n" + Table + "\n" + Progress
                    + "</body></html>";

        try (FileOutputStream out = new FileOutputStream(filename + ".pdf")) {
            HtmlConverter.convertToPdf(fullHtml, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}