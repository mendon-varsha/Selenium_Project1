package com.qsp.exp;

import java.util.Scanner;

class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	boolean b=isPal(n);
	if(b==true)
	{
		System.out.println("Palindrome");
	}
	else
		System.out.println("Not a palindrome");
		
}
public static boolean isPal(int n)
{
	int temp=n;
	int rev=0;
	while(n>0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(temp==rev)
	return true;
	else
		return false;
	
}
}

