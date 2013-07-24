package org.ypmamedia.googlefaces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import nl.ypmamedia.googlefaces.model.Column;
import nl.ypmamedia.googlefaces.model.DataTable;
import nl.ypmamedia.googlefaces.model.Row;

@ManagedBean
@SessionScoped
public class TestController {
	
	private DataTable dataTable = new DataTable();
    
	@PostConstruct
	public void setup() {
        dataTable.addColumn(new Column(Column.Type.string, "Worktype"));
        dataTable.addColumn(new Column(Column.Type.number, "Hours"));
        
        Row row = new Row(2);
        row.addEntry("Sleep");
        row.addEntry("5");
        dataTable.addRow(row);
        
        Row row2 = new Row(2);
        row2.addEntry("Eat");
        row2.addEntry("2");
        dataTable.addRow(row2);
        
        Row row3 = new Row(2);
        row3.addEntry("Work");
        row3.addEntry("4");
        dataTable.addRow(row3);
        
	}
 
    public DataTable getDataTable() {
        return dataTable;
    }
}
