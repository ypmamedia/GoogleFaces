package org.ypmamedia.googlefaces.model;

public class Column {

    public enum Type {date, number, string};
    
    String header;
    Type type;
   
    public Column(Type type, String title) {
        super();
        this.header = title;
        this.type = type;
    }
    
    public String getHeader() {
        return header;
    }
    public void setHeader(String title) {
        this.header = title;
    }
    
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    } 
}
