package nl.ypmamedia.googlefaces;

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
	private DataTable dataTableTwoSeries = new DataTable();
    
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
        
        creatDataTableTwoSeries();
      
	}
	
	private void creatDataTableTwoSeries(){
		dataTableTwoSeries.addColumn(new Column(Column.Type.string, "Year"));
        dataTableTwoSeries.addColumn(new Column(Column.Type.number, "Java popularity"));
        dataTableTwoSeries.addColumn(new Column(Column.Type.number, ".NET popularity"));
	        
        Row row = new Row(3);
        row.addEntry("2001");
        row.addEntry("0.3");
        row.addEntry("0.5");
        dataTableTwoSeries.addRow(row);
        
        Row row2 = new Row(3);
        row2.addEntry("2002");
        row2.addEntry("0.4");
        row2.addEntry("0.4");
        dataTableTwoSeries.addRow(row2);
        
        Row row3 = new Row(3);
        row3.addEntry("2003");
        row3.addEntry("0.5");
        row3.addEntry("0.3");
        dataTableTwoSeries.addRow(row3);
	}
 
    public DataTable getDataTable() {
        return dataTable;
    }

	public DataTable getDataTableTwoSeries() {
		return dataTableTwoSeries;
	}
}
