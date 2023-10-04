package com.jsp.interfaces;

interface Polygon
{
	// Abstract Methods to "Overriden is Mandatory"
	public void getArea(); 
	
	// Default Methods it is (optional to overriden)
	public default void getSides()
	{
		System.out.println("I have a polygon sides");
	}	
}

class Rectangle implements Polygon
{
	private int breath, height ;
	private double area;
	
	//Constructor Initilization in interface
	public Rectangle(int breath,int height) 
	{
		this.breath=breath;
		this.height=height;
	}
	
	@Override
	public void getArea() 
	{
		area = breath * height;
		System.out.println("Area of the Rectangle : "+area);
		
	}
}

class Square implements Polygon
{
	private int sides;
	private double area;
	
	//Constructor Initilization in interface
	public Square(int sides) 
	{
		this.sides=sides;
	}
	
	@Override
	public void getArea() 
	{
		area = sides* sides;
		System.out.println("Area of the square : "+area);	
	}
}

public class Main_Interface 
{
	public static void main(String[] args) 
	{
		Rectangle angle = new Rectangle(10, 6);
		          angle.getSides();
		          angle.getArea();
		          
	    Square square = new Square(5);
	           square.getArea();

	}

}
