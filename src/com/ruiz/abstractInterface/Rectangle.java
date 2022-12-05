package com.ruiz.abstractInterface;

public class Rectangle extends GeometricObject{
	private double length;
	private double width;

	
	@Override
	public double calculateArea() {
		return (length*width);
	}

	@Override
	public double calculateParameter() {
	
		return (length*2)+(width*2);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}



	public Rectangle() {
		
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
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
		return super.max(x, y);
	}



}
