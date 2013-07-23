package org.ypmamedia.googlefaces.model;

import java.util.ArrayList;
import java.util.Collection;

public class DataTable {
      
    private String chartPackage;
    private ArrayList<Column> columns = new ArrayList<Column>();
    private ArrayList<Row> rows = new ArrayList<Row>();
    
    public DataTable() {}
    
    public DataTable(String chartPackage) {
        this.chartPackage = chartPackage;
    }

    public Collection<Column> getColumns() {
        return columns;
    }

    public Collection<Row> getRows() {
        return rows;
    }

    public void addColumn(Column column) {
        columns.add(column);
    }

    public void addRow(Row row) {
        rows.add(row);
    }

    public String getChartPackage() {
        return chartPackage;
    }

	public void setChartPackage(String chartPackage) {
        this.chartPackage = chartPackage;
    }

	public String printDataTableRows() {
		StringBuilder sb = new StringBuilder();
	    sb.append("data.addRows([");
	    String delim="";
	    for(Row row : this.getRows()) {
	        sb.append(delim).append("[");
	        String delim2 = "";
	        int i =0;
	        for(String entry : row.getEntries()) {
	        	if(columns.get(i).type == Column.Type.number) {
	        		sb.append(delim2).append(entry);
	        	} else {
	        		sb.append(delim2).append("'").append(entry).append("'");
	        	}
	        	i++;
	            delim2 = ",";
	        }
	        sb.append("]");
	        delim=",";
	    }
	    sb.append("]);");
		return sb.toString();
	}
	
	public String printDataTableColumns(){
		StringBuilder sb = new StringBuilder();
		for(Column column : this.getColumns()) {
			sb.append("data.addColumn('" + column.getType() + "', '" + column.getHeader() + "');");
		}
		return sb.toString();
	}
}
