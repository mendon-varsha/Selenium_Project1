package com.qsp.exp;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=10;
	int n1=0;
	int n2=1;
	int n3 = 0;
	for(int i=2;i<=n;i++)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
	}
	System.out.println(n3);
}
}
