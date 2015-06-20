package com.healthykids.controls;

public class Select {
	private String value;
	private String label;
	private Boolean selected;
	
	public Select(String value, String label, Boolean selected) {
		super();
		this.value = value;
		this.label = label;
		this.selected = selected;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	
}
