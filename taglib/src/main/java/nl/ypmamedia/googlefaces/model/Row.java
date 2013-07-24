package nl.ypmamedia.googlefaces.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.joda.time.DateTime;

public class Row {

    private List<String> rowItems = new ArrayList<String>();
    private int size;
    private int currentVolume = 0;
    
    public Row(int size) {
        this.size = size;
    }
    
    public Row(String ... items) {
        for(String item : items) {
            addEntry(item);
        }
    }
    
    public Row(Collection<String> items) {
        for(String item : items) {
            addEntry(item);
        }
    }
    
    public boolean addEntry(String item) {
        if(currentVolume+1 > size) {
            throw new IndexOutOfBoundsException();
        }
        else {
            boolean full = false;
            rowItems.add(item);
            currentVolume++;
            if(currentVolume==size) {
                full = true;
            }
            return full;
        }
    }
    
    
    public List<String> getEntries() {
        return rowItems;
    }
    
    public boolean addEntry(DateTime date) {
        String javaScriptString = String.format("new Date(%d, %d, %d)", date.getYear(), date.getMonthOfYear(), date.getDayOfMonth());
        boolean isFull = addEntry(javaScriptString);
        return isFull;
    }
}

