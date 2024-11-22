package com.qspiders.exp;

public class Exception5 {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=1;
	a[1]=2;
	a[2]=6;
	a[3]=9;
	a[4]=4;
	//a[5]=10;
	try {
	for(int i=0;i<=a.length;i++)
	{
		System.out.println(a[i]);
	}
}
	catch(ArrayIndexOutOfBoundsException e)
	{
		
	}
	finally
	{
		System.out.println("Handled");
	}
}
}