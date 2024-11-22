package com.qsp.exp;

public class ExceptionEx1 {
public static void main(String[] args) {
	try {
	ExceptionEx1.Calc();
	}
	catch(ArithmeticException e)
	{
		System.out.println("Handled in Caller");
	}
	System.out.println("Okay");
}
public static void Calc()
{
	System.out.println(7+3);
	try {
		System.out.println(7/0);
	}
	finally
	{
		System.out.println("Hello");
	}
}
}
