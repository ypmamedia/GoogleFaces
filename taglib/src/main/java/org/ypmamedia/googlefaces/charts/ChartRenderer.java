package org.ypmamedia.googlefaces.charts;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;
import javax.faces.render.Renderer;

import org.ypmamedia.googlefaces.model.DataTable;

@FacesRenderer(componentFamily="org.ypmamedia.googlefaces.charts",
                rendererType="googleChartRenderer")
public class ChartRenderer extends Renderer {

    @Override
	public void decode(FacesContext context, UIComponent component) {
        super.decode(context, component);
    }
    
    @Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        UIChart uiChart = (UIChart) component;
        DataTable dataTable = (DataTable) uiChart.getValue();
        
        ResponseWriter writer = context.getResponseWriter();
        writer.startElement("div", uiChart);
        writer.writeAttribute("id", uiChart.getClientId(), "id");
        writer.endElement("div");
        
        writer.write("<script type='text/javascript' src='http://www.google.com/jsapi'>" +
        		"</script><script type='text/javascript'>" +
        		"google.load('visualization', '1', {'packages':['corechart']});" +
        		"google.setOnLoadCallback(drawChart); function drawChart() {" +
        		"var data = new google.visualization.DataTable();");
      
        writer.write(dataTable.printDataTableColumns());
        writer.write(dataTable.printDataTableRows());
        
        writer.write("var chart = new google.visualization." + uiChart.getType()
        							+ "(document.getElementById('" + uiChart.getClientId() + "')); "
        			+ "chart.draw(data, {" + uiChart.getOptions() + "}); } </script>");
    }
}
