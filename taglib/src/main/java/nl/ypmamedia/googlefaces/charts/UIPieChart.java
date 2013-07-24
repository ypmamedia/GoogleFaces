package nl.ypmamedia.googlefaces.charts;

import javax.faces.component.FacesComponent;

@FacesComponent("pieChart")
public class UIPieChart extends UIChart{

	@Override
	public String getType() {
		return "PieChart";
	}

	
}
