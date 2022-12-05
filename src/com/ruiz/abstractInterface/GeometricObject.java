package com.ruiz.abstractInterface;

public abstract class GeometricObject implements Comparable{
	private boolean fill;
	private String color;
	public GeometricObject(boolean fill, String color) {
		
		this.fill = fill;
		this.color = color;
	}
	public GeometricObject() {
		this.fill= true;
		this.color="";
	}
	

	
	@Override
	public String max(double x, double y) {
		if(x>y) {
			return "Object 1 is larger.";
		}else if(y>x) {
			return "Object 2 is larger";
		}else if(x==y) {
			return "Objects are equal";
		}
		return null;
	}
	
	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	abstract public double calculateArea();
	abstract public double calculateParameter();
	@Override
	public String toString() {
		return "GeometricObject fill: " + fill + " color: " + color + ".";
	}
	
}
