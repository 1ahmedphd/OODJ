//make document class
package oodj;
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

    public void CreateTable() {
        // TODO Auto-generated method stub
        
    }
    public void createProgress() {
        // TODO Auto-generated method stub
        
    }
    public void ToDocument() {
        // make it put the content and filename into a document format
        
    }
}