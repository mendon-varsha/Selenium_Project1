package com.qsp.exp;
import java.util.Scanner;
public class CheckBalance {
 public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your pin");
	int n=sc.nextInt();
	try {
	if(n==2255)
	{
		System.out.println("Enter the amount");
		int a=sc.nextInt();
		if(a<5000) {
			System.out.println(" Please wait!!! Transaction is processing");
		}
		else
		{
			throw new WrongAmountException("Insufficient Balance");
		}
	}
	else
	{
		throw new InvalidPinException("You have entered invalid pin");
	}
	}
	
	finally
	{
		System.out.println("Thank you");
	}
	}
}
