package com.ruiz.abstractInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AbstractDemo {
// Coded by Stacie Ruiz
//12-5-2022
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
		System.out.println();
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.setRadius(1);
		c2.setRadius(2);
		
		double cArea1 = c1.calculateArea();
		double cArea2 = c2.calculateArea();
		System.out.println(c1.max(cArea1, cArea2));
		System.out.println();
		
		sortList();
	
	
	}
	public static void sortList() {
		ArrayList<Integer> myAl = new ArrayList<Integer>();
		myAl.add(10);
		myAl.add(1);
		myAl.add(12);
		myAl.add(22);
		myAl.add(30);
		myAl.add(40);
		
		System.out.println(myAl);
		Collections.sort(myAl);
		System.out.println("Sorted list: "+myAl);
		}
	
}
