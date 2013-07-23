package org.ypmamedia.googlefaces.charts;

import javax.faces.component.FacesComponent;

@FacesComponent("barChart")
public class UIBarChart extends UIChart{

	@Override
	public String getType() {
		return "BarChart";
	}
	
	

}
