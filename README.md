# GoogleFaces

### Introduction. 

[![Build Status](https://travis-ci.org/ypmamedia/GoogleFaces.png?branch=master)](https://travis-ci.org/ypmamedia/GoogleFaces)

GoogleFaces (http://googlefaces.ypmamedia.nl) is a JSF library which provides a set of JSF components 
to use Google Charts in your JSF application.

### Example.

IN your xhtml page:
```xml
<gf:pieChart value="#{testController.dataTable}" 
     options="backgroundColor: 'none', legend: {position:'none'}, bar: {groupWidth: '90%'}" />
```

Your backing bean:

```java
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
```


