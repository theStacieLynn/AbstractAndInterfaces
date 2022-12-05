package com.ruiz.abstractInterface;

import java.util.ArrayList;

public class AbstractDemo {

	public static void main(String[] args) {
		Triangle myTriangle = new Triangle(2,3,7);
		myTriangle.setColor("Blue");
		myTriangle.setFill(false);
		System.out.println(myTriangle.toString());
		System.out.println();
		//GeometricObject implements comparable
		Rectangle obj1= new Rectangle();
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(5,10);
		
		double area1 = r1.calculateArea();
		double area2 =r2.calculateArea(); 
		System.out.println(obj1.max(area1, area2));
		
		
		
	
	}
	
}
