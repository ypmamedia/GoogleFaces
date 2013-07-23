package org.ypmamedia.googlefaces.charts;

import javax.faces.component.FacesComponent;

@FacesComponent("columnChart")
public class UIColumnChart extends UIChart {

	@Override
	public String getType() {
		return "ColumnChart";
	}

}
