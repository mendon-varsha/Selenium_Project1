package com.qspiders.exp;
import java.util.Scanner;
public class CheckAge {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age");
int age=sc.nextInt();

	if(age>25)
	{
		System.out.println("Go Ahead");
	}
	else
	{
		throw new InvalidAgeException("You have entered wrong age");
	}
}

}
