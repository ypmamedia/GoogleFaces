package org.ypmamedia.googlefaces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.ypmamedia.googlefaces.model.Column;
import org.ypmamedia.googlefaces.model.DataTable;
import org.ypmamedia.googlefaces.model.Row;

@ManagedBean
@SessionScoped
public class TestController {
	
	private DataTable chartModel = new DataTable();
    
	@PostConstruct
	public void setup() {
        chartModel.addColumn(new Column(Column.Type.string, "Worktype"));
        chartModel.addColumn(new Column(Column.Type.number, "Hours"));
        
        Row row = new Row(2);
        row.addEntry("Sleep");
        row.addEntry("5");
        chartModel.addRow(row);
        
        Row row2 = new Row(2);
        row2.addEntry("Eat");
        row2.addEntry("2");
        chartModel.addRow(row2);
        
        Row row3 = new Row(2);
        row3.addEntry("Work");
        row3.addEntry("4");
        chartModel.addRow(row3);
        
	}
 
    public DataTable getChartModel() {
        return chartModel;
    }
}
