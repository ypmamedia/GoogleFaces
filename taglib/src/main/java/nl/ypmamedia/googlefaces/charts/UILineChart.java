package nl.ypmamedia.googlefaces.charts;

import javax.faces.component.FacesComponent;

@FacesComponent("lineChart")
public class UILineChart extends UIChart {

	@Override
	public String getType() {
		return "LineChart";
	}

}
