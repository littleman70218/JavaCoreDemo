package net.antra.daytwo;

import java.io.Serializable;

public class Apple implements Cloneable, Serializable{
	private static final long serialVersionUID = 6004797383817888035L;

	static{
		System.out.println("Apple class is loaded, this is in static block");
	}
	{
		System.out.println("Apple object is created, this is in non-static block");
	}
	Apple(){
		System.out.println("Apple object is created, this is in constructor");
	}
	String color;
	
	public Apple clone() throws CloneNotSupportedException{
		return (Apple)super.clone();
	}
}
