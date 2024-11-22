package com.qsp.exp;

import java.util.Scanner;

public class CompareEx {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter 5 elements to the array");
	for(int i=0;i<a.length;i++) {
		int b=s.nextInt();
		if(b==100)
		{
			throw new ArrayIndexOutOfBoundsException("100 is not accepted");
			
		}
		else
			
		{
			a[i]=b;
		}
	}
	for(int i=0;i<a.length;i++)
	{
	System.out.print(a[i]+" ");
}
}
}
