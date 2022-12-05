package com.ruiz.mystringbuilder;
//Coded by Stacie Ruiz
//12-05-2022
public class MyStringBuilder {
	StringBuilder s = new StringBuilder();

	public MyStringBuilder(StringBuilder s) {
		super();
		this.s = s;
	}
	public MyStringBuilder append(MyStringBuilder s) {
		return s.append(s);
	}
	
	public MyStringBuilder append(int i) {
		return this.append(i);
	}
	public int length() {
		return this.length();
	}
	public char charAt(int index) {
		return this.charAt(index);
	}
	public MyStringBuilder toLowerCase() {
		return this.toLowerCase();
	}
	public MyStringBuilder substring(int begin, int end) {
		return this.substring(begin, end);
	}
	public String toString() {
		return this.toString();
	}
	

}
