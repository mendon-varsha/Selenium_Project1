package com.qsp.exp;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int count=0;
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==0)
	{
		System.out.println("Prime number");
	}
	else
		System.out.println("Not a prime number");
}
}
