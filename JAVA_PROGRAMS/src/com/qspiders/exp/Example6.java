package com.qspiders.exp;

public class Example6 {
public static void main(String[] args) {
	try {
	Example6.calc();
	}
	catch(ArithmeticException e)
	{
		
	}
	System.out.println("Hello");
	
}
public static void calc()
{
	
	System.out.println(7/0);
}
	
}
