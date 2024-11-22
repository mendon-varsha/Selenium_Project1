package com.qsp.exp;

import java.util.Scanner;

public class ExceptionEx3 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two integer values");
	int a=s.nextInt();
	int b=s.nextInt();
	if(b==2)
	{
		throw new ArithmeticException ("Div by 2 is not possible");
	}
	else {
		System.out.println(a/b);
	}
}
}
