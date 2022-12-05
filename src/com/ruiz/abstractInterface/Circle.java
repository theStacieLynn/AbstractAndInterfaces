package com.ruiz.abstractInterface;

public class Circle extends GeometricObject{
	double radius;
	double myPi=3.14;
	
	public Circle() {
	}

	public Circle(double radius, double myPi) {
		super();
		this.radius = radius;
		this.myPi = myPi;
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

	@Override
	public double calculateArea() {
		return (radius*radius)*myPi;
	}

	@Override
	public double calculateParameter() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
