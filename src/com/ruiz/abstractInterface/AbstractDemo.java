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
