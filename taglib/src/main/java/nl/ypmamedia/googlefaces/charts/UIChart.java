package nl.ypmamedia.googlefaces.charts;

import javax.faces.component.UIComponentBase;

public abstract class UIChart extends UIComponentBase {

    public static final String DEFAULT_RENDERER = "nl.ypmamedia.googlefaces.charts.ChartRenderer";
    public static final String COMPONENT_FAMILY = "nl.ypmamedia.googlefaces.charts";

    abstract public String getType();
    
    protected enum PropertyKeys {
        model,
        width,
        height,
        options,
        value;
        
        String toString;
        
        PropertyKeys(String toString) {
            this.toString = toString;
        }
        
        PropertyKeys() {}
        
        @Override
		public String toString() {
            return((this.toString != null) ? this.toString : super.toString());
        }
    }
    
    public UIChart() {
        setRendererType(DEFAULT_RENDERER);
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getWidth() {
        return (String) getStateHelper().eval(PropertyKeys.width, null);
    }

    public void setWidth(String width) {
    	getStateHelper().put(PropertyKeys.width, width);
    }

    public String getHeight() {
        return (String) getStateHelper().eval(PropertyKeys.height);
    }

    public void setHeight(String height) {
    	getStateHelper().put(PropertyKeys.height, height);
    }
    
    public String getOptions() {
        return (String) getStateHelper().eval(PropertyKeys.options);
    }

    public void setOptions(String options) {
    	getStateHelper().put(PropertyKeys.options, options);
    }
	
	public Object getValue() {
		return getStateHelper().eval(PropertyKeys.value);
	}

	public void setValue(Object value) {
		getStateHelper().put(PropertyKeys.value, value);
	}
}
