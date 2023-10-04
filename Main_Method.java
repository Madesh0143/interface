package com.jsp.interfaces;


interface One
{
	int a=10;
	public void method1();
}
interface Two
{
	public void method2();
}

class Demo 
{
	public void name() 
	{
		System.out.println("sub class");
	}
	
}

//Accessiing two are more interface methods
class Sample extends Demo implements One,Two
{
	@Override
	public void method1() 
	{
		System.out.println("overiden for first interface");
		
	}
	@Override
	public void method2() 
	{
		System.out.println("overiden for second interface");
		
	}	
}

public class Main_Method 
{
	public static void main(String[] args) 
	{
		 Sample s = new  Sample();
		        s.name();
		        s.method1();
		        s.method2();
		       System.out.println(s.a);

	}

}
